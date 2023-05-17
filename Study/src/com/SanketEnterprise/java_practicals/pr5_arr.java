package com.SanketEnterprise.java_practicals;
import java.util.Scanner;
import java.util.Arrays;

public class pr5_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of array : ");
        int arrr= sc.nextInt();
        String s= Integer.toString(arrr);

        int[] ar = {1,2,3,4,5,9};
        String[] strAr= {Arrays.toString(ar)};

        for (int i=0; i<strAr.length;i++){
            if (strAr[i].contains(s)){
                System.out.println(true);
            }
        }

    }
}
