package com.SanketEnterprise.java_practicals;

import java.util.Scanner;

public class DataOfPatient {
    String name,disease,admit,discharge;
    int age;
    Scanner sc = new Scanner(System.in);

    void dataInput(){

        System.out.print("Enter your name : ");
        name= sc.nextLine();
        System.out.print("Your disease    : ");
        disease= sc.nextLine();
        System.out.print("Enter Date of admit (dd/mm/yyyy)    : ");
        admit= sc.nextLine();
        System.out.print("Enter Date of Discharge (dd/mm/yyyy): ");
        discharge= sc.nextLine();
        System.out.print("Enter your age: ");
        age= sc.nextShort();

    }
    void display(){
        Date d = new Date();
        System.out.println("Name of Patient : "+name);
        System.out.println("Age of Patient  : "+age);
        System.out.println("Name of Disease : "+disease);
        d.admitDate(admit);
        d.dischargeDate(discharge);
    }

    public static void main(String[] args) {
        DataOfPatient pat = new DataOfPatient();
        pat.dataInput();
        pat.display();
    }
}
