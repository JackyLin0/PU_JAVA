package Data_Struct_1221;

import java.util.Scanner;

public class SelectSort {
    static  int arr[]= new int [10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length - 1;i++)
        {
            arr[i] = sc.nextInt();
        }
        SelectSort(arr);
      //  swap(arr,0,3);
        print(arr);



    }

    public static void SelectSort(int[] a) {

        int i,j,np;
        for(i = 0; i < a.length-1;i++)
        {
            np = i;
     		for(j = i+1 ; j < a.length; j++){
    			if(a[np]>a[j])
    			np = j;}
                swap(a,np,i);
         }


    }
    public static int[] swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] =  a[j];
        a[j] = temp;
        return a;

    }
    public static void print(int[] a) {
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
