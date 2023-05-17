package com.SanketEnterprise.java_practicals;

import java.util.Scanner;

public class prt1_5 {
    public static void main(String[] args) {
        System.out.print("Enter number of apples : ");
        Scanner sc = new Scanner(System.in);
        int apple = sc.nextInt();
        int gross = apple/144;
        int dozen = (apple - gross*144)/12;
        int remaining = apple - gross*144 - dozen*12;
        System.out.println("Your number of apples is " +gross+ " gross "+ dozen +" dozen, and since "
                +apple +" is equal to " +gross+"*144 + "+dozen + " *12 + "+remaining);

    }
}
