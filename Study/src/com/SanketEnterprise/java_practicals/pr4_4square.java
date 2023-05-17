package com.SanketEnterprise.java_practicals;

public class pr4_4square extends pr4_4Rectangle{
    void method(){
        System.out.println("square is rectangle...!!");
    }

    public static void main(String[] args) {
        shape obj = new shape();
        pr4_4Rectangle obj1= new pr4_4Rectangle();

        obj.method();
        obj1.method();
    }
}
