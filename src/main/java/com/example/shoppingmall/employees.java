package com.example.shoppingmall;

import java.util.ArrayList;

public class employees
{
    public static ArrayList<String> adhaar_no = new ArrayList<String>();
    public static ArrayList<String> employee_name = new ArrayList<String>();
    public static ArrayList<String> employee_contact = new ArrayList<String>();





    public void add(String u, String p, String q){
        adhaar_no.add(u);
        employee_name.add(p);
        employee_contact.add(q);

    }
    public void delete(String u, String p, String q)
    {
        adhaar_no.remove(u);
        employee_name.remove(p);
        employee_contact.remove(q);
    }
    public  ArrayList getAdhaar()
    {
        return adhaar_no;
    }
    public ArrayList getEmployeeName()
    {
        return employee_name;
    }
    public ArrayList contact()
    {
        return employee_contact;
    }

}
