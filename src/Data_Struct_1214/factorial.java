package Data_Struct_1214;

import java.util.*;
public class factorial
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(facNonZero(n));


    }

    public static int facNonZero(int x)
    {
        int res = 1;
        if (x == 1) return 1;
        for(int i = 2; i<=x; i++)
        {
            res = res*i;
            while (res%10 ==0) res/=10;
            res = res%1000;
        }
        return res%10;
    }


}