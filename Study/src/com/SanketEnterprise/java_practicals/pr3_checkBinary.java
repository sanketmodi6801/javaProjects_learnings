package com.SanketEnterprise.java_practicals;
import java.util.Scanner;

public class pr3_checkBinary {
    static boolean binary;
    public static void main(String[] args) {
        System.out.println("Enter any binary string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (String s : str.split("")) {
            if (s.equals("0") || s.equals("1") || s.equals("01") || s.equals("10")) {
               binary =!binary;
            } }
        if (binary) {
            System.out.println("This is a binary string!!!");
        } else {
            System.out.println("This string is not binary !!!");
        }
    }
}
