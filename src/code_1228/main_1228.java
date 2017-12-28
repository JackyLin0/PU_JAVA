package code_1228;

import java.util.Scanner;

public class main_1228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Good  morning,Jacky01!";
        //sc.nextLine();
        String ns ="";
        char[] c = new char[100];
        int pos = 0;
        for(int i=0;i<str.length();i++)
        {
            if(!Character.isLetter(str.charAt(i)))
                c[pos++]=str.charAt(i); //記錄非 字元符號//
        }

      //  for(char ch: c) System.out.println(ch);


       String[]  strArray = str.split("[^a-zA-Z]");
       pos = 0;
       for(String s:strArray)
       {
           for(int i=s.length()-1;i>=0;i--)
           {
               ns+=s.charAt(i);
           }
           ns+=c[pos++];
       }
        System.out.println(ns);
     }

}
