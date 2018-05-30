package com.spring.User;

import java.util.ArrayList;

/**
 * Created by Степан1 on 21.05.2018.
 */
public class Chart {

    private String CharName;

    private ArrayList<Double> CharPriceClose;

    private ArrayList<String> CharDate;

    public ArrayList<Double> getCharPriceClose() {
        return CharPriceClose;
    }

    public void setCharPriceClose(ArrayList<Double> charPriceClose) {
        CharPriceClose = charPriceClose;
    }

    public ArrayList<String> getCharDate() {
        return CharDate;
    }

    public void setCharDate(ArrayList<String> charDate) {
        CharDate = charDate;
    }

    public String getCharName() {

        return CharName;
    }

    public void setCharName(String charName) {
        CharName = charName;
    }
}
