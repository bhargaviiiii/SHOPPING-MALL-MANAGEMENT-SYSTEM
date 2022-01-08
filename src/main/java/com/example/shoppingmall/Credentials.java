package com.example.shoppingmall;
import java.util.ArrayList;


public class Credentials
{



        public static ArrayList<String> usernames = new ArrayList<String>();
        public static ArrayList<String> passwords = new ArrayList<String>();

        public void add(String u, String p){
            usernames.add(u);
            passwords.add(p);
        }
    public void delete(String u, String p, String q)
    {
        usernames.remove(u);
        passwords.remove(p);

    }
        public  ArrayList getUserNames()
        {
            return usernames;
        }
        public ArrayList getPasswords()
        {
            return passwords;
        }


    }


