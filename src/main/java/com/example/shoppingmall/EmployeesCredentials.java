package com.example.shoppingmall;

import java.util.ArrayList;

public class EmployeesCredentials
{
    public static ArrayList<String> eUsername = new ArrayList<String>();
    public static ArrayList<String> ePassword = new ArrayList<String>();
    public static ArrayList<String> eCPassword = new ArrayList<String>();
    public void add(String u, String p, String q){
        eUsername.add(u);
        ePassword.add(p);
        eCPassword.add(q);

    }
    public void delete(String u, String p, String q)
    {
        eUsername.remove(u);
        ePassword.remove(p);
        eCPassword.remove(q);
    }

    public  ArrayList getEUsername()
    {
        return eUsername;
    }
    public ArrayList getEPassword()
    {
        return ePassword;
    }
    public ArrayList getCPassword(){return eCPassword;}

    public void add(String toString, String toString1)
    {
        eUsername.add(toString);
        ePassword.add(toString1);
    }
}
