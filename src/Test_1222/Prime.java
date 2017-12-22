package Test_1222;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        int n, i ,j,count= 0;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //測試 n是否為質數
        for(j = 2; j < n ;j++) {
            isPrime = true;
            for (i = 2; i < j; i++){
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
                System.out.print(j+"\t");
            }
            if(count == 5)
            {
                count = 0;
                System.out.println();
            }
        }


        if(isPrime)
            System.out.println("質數");
    }
}
