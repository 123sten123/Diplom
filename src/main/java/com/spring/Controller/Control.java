package com.spring.Controller;



import com.spring.User.*;
import com.spring.dde.DdeClient;
import com.spring.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Степан1 on 03.04.2018.
 */
@Controller
public class Control {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("index");
        System.out.println("URA");

        Map< String, String > phones = new HashMap<String, String>();
        phones.put("samsung", "SAMSUNG");
        phones.put("nokia", "NOKIA");
        phones.put("iphone", "IPHONE");

        Map< String, String > phones2 = new HashMap<String, String>();
        phones2.put("111", "111");
        phones2.put("222", "222");
        phones2.put("222", "333");


        Map< String, String > phones3 = new HashMap<String, String>();
        phones3.put("444", "444");
        phones3.put("555", "555");
        phones3.put("666", "666");

        modelAndView.addObject("phonesMap", phones);
       modelAndView.addObject("smartphone", new Smartphone());

        modelAndView.addObject("phonesMap2", phones2);
        modelAndView.addObject("smartphone2", new Smartphone());

        modelAndView.addObject("phonesMap3", phones3);
        modelAndView.addObject("smartphone3", new Smartphone());

        //modelAndView.addAllObjects();
        modelAndView.addObject("contact", new Test());
        modelAndView.addObject("contactList", contactService.listContact());


        return modelAndView;
    }

    @RequestMapping(value = "one/userJSP")
    public ModelAndView checkUser(@ModelAttribute("userJSP") Test user, Raschet raschet, Chart chart, MarketStock marketStock) {
        ModelAndView modelAndView = new ModelAndView();
        contactService.save(user);

        //имя представления, куда нужно будет перейти
        modelAndView.setViewName("userJSP");

        //записываем в атрибут userJSP (используется на странице *.jsp объект user
        modelAndView.addObject("userJSP", user);

        raschet.setRs(contactService.Korrel(marketStock.getSctock1(),marketStock.getSctock2()) );

        chart.setCharPriceClose(contactService.getClose1());
        chart.setCharDate(contactService.getDate1());
        modelAndView.addObject("Cor", raschet);
        Chart chart2 = new Chart();
        chart2.setCharPriceClose(contactService.getClose2());
        chart2.setCharDate(contactService.getDate2());

        modelAndView.addObject("CloseOne", chart);
        modelAndView.addObject("CloseTwo", chart2);





        Map< String, String > phones = new HashMap<String, String>();
        phones.put("NYSE", "NYSE");
        phones.put("MOEX", "Московская биржа");


        Map< String, String > phones2 = new HashMap<String, String>();
        phones2.put("MSFT", "MSFT");
        phones2.put("AAPL", "AAPL");

        Map< String, String > phones3 = new HashMap<String, String>();
        phones3.put("SBER", "SBER");
        phones3.put("VTBR", "VTBR");


        modelAndView.addObject("phonesMap", phones);
        modelAndView.addObject("smartphone", new Smartphone());

        modelAndView.addObject("phonesMap2", phones2);
        modelAndView.addObject("smartphone2", new Smartphone());

        modelAndView.addObject("phonesMap3", phones3);
        modelAndView.addObject("smartphone3", new Smartphone());

        modelAndView.addObject("userJSP", new User());


        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
    }


    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId) {

        contactService.removeContact(contactId);
        System.out.println("Test");

        return "redirect:/one";
    }

//    @RequestMapping(value = "one/add/")
//    public String history(@ModelAttribute("marketStock") MarketStock marketStock, Map<String, Object> map)
//    {
//
//        map.put("marketStock", new MarketStock());
//        System.out.println("Test");
//
//        return "redirect:/one/userJSP";
//    }

    @RequestMapping(value = "/one/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contact") Raschet raschet, MarketStock marketStock,
                             BindingResult result) {

        //contactService.save();

        return "redirect:/one/userJSP";
    }

    @RequestMapping(value = "one/bayes")
    public ModelAndView bayesMethod()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bayes");


        return modelAndView;
    }



}
