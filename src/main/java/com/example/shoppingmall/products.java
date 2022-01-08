package com.example.shoppingmall;

import java.util.ArrayList;

public class products
{

    public static ArrayList<String> ids = new ArrayList<String>();
    public static ArrayList<String> names = new ArrayList<String>();
    public static ArrayList<String> types = new ArrayList<String>();
    public static ArrayList<String> companies = new ArrayList<String>();
    public static ArrayList<String> prices = new ArrayList<String>();

    public void add(String u, String p, String q, String r, String s){
        ids.add(u);
        names.add(p);
        types.add(q);
        companies.add(r);
        prices.add(s);
    }
    public void delete(String u, String p, String q, String r, String s)
    {
        ids.remove(u);
        names.remove(p);
        types.remove(q);
        companies.remove(p);
        prices.remove(q);
    }
    public  ArrayList getId()
    {
        return ids;
    }
    public ArrayList getName()
    {
        return names;
    }
    public ArrayList getType()
    {
        return types;
    }
    public ArrayList getCompany()
    {
        return companies;
    }
    public ArrayList<String> getPrices(int i)
    {
        return prices;
    }


}
