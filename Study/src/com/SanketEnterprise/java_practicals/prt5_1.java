package com.SanketEnterprise.java_practicals;

public class prt5_1 {

    public static void main(String[] args) {
        int x=5,y=0;
        try{
        System.out.println(x/y);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
