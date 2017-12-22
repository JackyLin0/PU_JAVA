package Test_1222;

import java.util.Scanner;

public class CountLetter {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            char[] A = str.toLowerCase().toCharArray();  //轉換成字元陣列
            int index;
            int[] frequency = new int[26];  //紀錄數字字元出現的次數

            for(int i=0;i<A.length;i++){
                index = A[i]-'a';
                if(index>=0 && index<=25) // a-z字元
                    frequency[index]++;
            }

            for(int i=0;i<frequency.length;i++){
                if(frequency[i]>0)
                    System.out.printf("(%s,%d)", (char)('a'+i) , frequency[i]);
            }

        }

    }
