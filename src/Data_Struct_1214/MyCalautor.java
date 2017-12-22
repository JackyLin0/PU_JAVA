package Data_Struct_1214;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class MyCalautor {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Stack<Double> cal = new Stack();
        Vector<String> v = new Vector<>();
        String inputs = sc.nextLine();
        String[] in = inputs.split("");
        double x = 0,y = 0;

        for (int i = in.length -1  ; i>=0 ; i--)
        {
             switch (in[i]){
                case "$":
                    x = cal.pop();
                    y =  cal.pop();
                    cal.push((x+y)/2.0);
                    break;
                case "%":
                    x = cal.pop();
                    y = cal.pop();
                    cal.push((x - y)/2.0);
                    break;
                default:
                    if (!in[i].equals(" ")) {
                     cal.push(Double.parseDouble(in[i]));
                    }
                    break;
            }

        }
        if (!cal.empty())
        System.out.printf("%.6f\r\n",cal.pop());

    }


}
