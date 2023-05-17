package com.SanketEnterprise.java_practicals;

public class prt1_4 {

    public static void main(String[] args) {
        int p = 45000;
        double r,t;
        r=0.07;
        t=1;
        float interest = (float) ((p*r*t)/100);
        p = (int) (p + interest);
        System.out.println("The interest is :"+ interest);
        System.out.println("Your priciple amount is now :"+p);
    }
}
