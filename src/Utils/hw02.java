package Utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class hw02 {
    public static void main(String[] args) {
        int N = -1;
        boolean isCorrent = false, isrepeat = false;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            String str = sc.nextLine();
            if (isCorrent = str.matches("^[1-9]*"))
                N = Integer.valueOf(str);
            else
                System.out.println("必須輸入正整數");
        } while (!isCorrent);

        String[] s = new String[N];

        while(i<s.length)
        {
            isrepeat = false;
            String tmp = sc.next();
            for(int j=0;j<i;j++)
            {
                if(tmp.equals(s[j])) //重複
                {
                    isrepeat = true;
                    break;
                }
            }
            if(!isrepeat)
                s[i++]=tmp;
            else
                System.out.println(tmp+"重複輸入");

        }

        for (String str: s)
            System.out.print(str + " ");
    }

}
