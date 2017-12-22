package code_1221;

import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        /*正三角形*/
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j < n - 1; j++) System.out.print(" ");
            for (int j = 2 * i; j >= 0; j--) System.out.print("*");
            System.out.println();
        }

        /*倒三角形*/
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) System.out.print(" ");
            for (int j = 0; j <= 2 * i; j++) System.out.print("*");

            System.out.println();
        }
    }
}
