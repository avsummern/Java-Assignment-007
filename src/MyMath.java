/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 * @since version 1.0
 */

import java.util.Scanner;

public class MyMath {
    public static void gcf(int a, int b, int c){
        if (a>b){
            if(c==0){
                System.out.println("The gcf is " + a);
            }
            else{
                c = a%b;
                gcf(b,c,c);
            }
        }
        if(b>a){
            if(c==0){
                System.out.println("The gcf is " + b);
            }
            else{
                c = b%a;
                gcf(a,c,c);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number 1: ");
        int a = Integer.valueOf(in.nextLine());
        System.out.println("Number 2: ");
        int b = Integer.valueOf(in.nextLine());
        gcf(a, b, 1);
    }
}
