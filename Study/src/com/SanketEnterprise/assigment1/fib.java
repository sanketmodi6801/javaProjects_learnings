package com.SanketEnterprise.assigment1;
// this program is about fibbonaci series.
// the commented part is sum of fibbonaci series.
import java.util.Scanner;

public class fib {
    static int x=0,y=1,z=0;
    void fibbo(int n){
//        if (n<=1){
//            return n ;
//        }
//    return  fibbo(n-1)+fibbo(n-2);
        if(n>0){
            z = x + y;
            x = y;
            y = z;
            System.out.print(" "+z);
            fibbo(--n);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int n = sc.nextInt();
        fib obj = new fib();
//        System.out.println();
        obj.fibbo(n);
    }

}
