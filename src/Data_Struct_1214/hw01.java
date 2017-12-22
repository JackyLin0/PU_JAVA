package Data_Struct_1214;

import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = 0;
        int right = 0;
        String in = sc.nextLine();
        char[] ch = in.toCharArray();
        for (char c : ch)
        {
            switch (c)
            {
                case '(' :left++ ;break;
                case ')' :right++; break;
            }
        }

        if (left == right)
        {
            System.out.println("YES");
        }else
        {
            System.out.println("NO");
        }
    }
}
