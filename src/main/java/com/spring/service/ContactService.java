package com.spring.service;

import com.spring.User.Raschet;
import com.spring.User.Test;
import com.spring.User.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Степан1 on 05.05.2018.
 */
public interface ContactService {
    public void save(Test user);
    public List<Test> listContact();
    public void removeContact(Integer id);

    public double Korrel(String a, String b);

    public ArrayList<Double> getClose1();
    public ArrayList<String> getDate1();

    public ArrayList<Double> getClose2();
    public ArrayList<String> getDate2();

}
