package code_1221;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
     //   String str = "like father like son";
        String[] words = str.split(" ");

        System.out.println(reverseLine(words));
    }


    public static String reverseLine(String[] strArray)
    {
        if (strArray.length == 1)
        {
            return reverseWord(strArray[0]);
        }
        else {
            String[] sAry = new String[strArray.length-1];
            System.arraycopy(strArray,1,sAry,0,strArray.length-1);
            return reverseLine(sAry)+" "+reverseWord(strArray[0]);
        }

    }

    private static String reverseWord(String str){
        if (str.length() == 1)
            return str;
        else
            return str.charAt(str.length()-1)+reverseWord(str.substring(0,str.length()-1));
    }
}