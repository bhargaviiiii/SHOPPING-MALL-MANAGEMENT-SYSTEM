package com.example.shoppingmall;

import java.util.ArrayList;

public class BILL extends products
{

    public static ArrayList<String> productsBill = new ArrayList<String>();

    public void add(String u)
    {
        productsBill.add(u);
    }
    public void add(String u, String v)
    {
        productsBill.add(Integer.parseInt(u), v);
    }

    public String setPrices(int i)
    {
        return prices.toString();
    }
    public String getPrice()
    {
        return prices.toString();
    }

}
