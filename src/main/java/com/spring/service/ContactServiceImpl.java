package com.spring.service;

import com.spring.Dao.PersonDao;
import com.spring.User.Raschet;
import com.spring.User.Test;
import com.spring.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Степан1 on 05.05.2018.
 */
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private PersonDao personedao;

    @Transactional
    public void save(Test user) { personedao.save(user);}

    @Transactional
    public List<Test> listContact() {

        return personedao.listContact();
    }

    @Transactional
    public void removeContact(Integer id) {
        personedao.removeContact(id);
    }

    private ArrayList<Double> close1 = new ArrayList<Double>();
    private ArrayList<String> Date1 = new ArrayList<String>();

    private ArrayList<Double> close2 = new ArrayList<Double>();
    private ArrayList<String> Date2 = new ArrayList<String>();


    public ArrayList<Double> getClose2() {
        return close2;
    }

    public void setClose2(ArrayList<Double> close2) {
        this.close2 = close2;
    }

    public ArrayList<String> getDate2() {
        return Date2;
    }

    public void setDate2(ArrayList<String> date2) {
        Date2 = date2;
    }



    public ArrayList<Double> getClose1() {
        return close1;
    }

    public void setClose1(ArrayList<Double> close1) {
        this.close1 = close1;
    }

    public ArrayList<String> getDate1() {
        return Date1;
    }

    public void setDate1(ArrayList<String> date1) {
        Date1 = date1;
    }

    public double Korrel(String stock1, String stock2)
    {
        RConnection c = null;
        double correl = 0;
        try{

            c = new RConnection();

            String qw = stock1.replaceAll(",-","");

            REXP x = c.eval("test1<-c(1,2,3)");

            x=c.eval("library('quantmod')");
            x=c.eval("startDate = as.Date('2012-01-01')");
            x=c.eval("endDate = as.Date('2014-01-01')");
            //загрузка 1 стака
            String temp = "getSymbols('"+qw+"', src = 'yahoo', from = startDate, to = endDate)";
            x=c.eval(temp);
            //загрузка 2 стака
            x=c.eval("getSymbols('MSFT', src = 'yahoo', from = startDate, to = endDate)");
            x=c.eval("PriceCloseAAPL<-Cl("+qw+")");
            int i = 0;
            for (double a: x.asDoubles()) {
                close1.add(a);
                String b = String.valueOf(i);
                Date1.add(b);
                i++;
            }

            //Запис данных 2 акции
            x=c.eval("PriceCloseMSFT<-Cl(MSFT)");
            i = 0;
            for (double a: x.asDoubles()) {
                close2.add(a);
                String b = String.valueOf(i);
                Date2.add(b);
                i++;

            }
            x=c.eval("a<-data.frame(date = index((MSFT)))");
         //   x.
         //   System.out.println(x.asString());
//            for (double a: x.asDoubles()) {
//
//                Date2.add(a);
//
//            }
            //Расчет корреляции
            x=c.eval("cor(PriceCloseAAPL,PriceCloseMSFT,method='pearson')");
            correl = x.asDouble();

            System.out.println(x.asDouble());



        }catch(Exception e){

            e.printStackTrace();

        }finally{

            if ( c != null ){

                try{

                    c.close();

                }finally{}

            }

        }

      //  String formattedDouble = new DecimalFormat("#0.00").format(correl);
       // double d = Double.parseDouble(formattedDouble);
       return  correl;
    }
}
