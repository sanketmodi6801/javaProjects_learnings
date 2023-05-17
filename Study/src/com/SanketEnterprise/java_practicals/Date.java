package com.SanketEnterprise.java_practicals;

public class Date extends DataOfPatient{

    void admitDate(String admit){
        String day= admit.substring(0,2);
        String month= admit.substring(3,5);
        String year= admit.substring(6,10);
        System.out.println("Date of Month : "+day);
        System.out.println("Month : "+month);
        System.out.println("Year  : "+year);
    }
    void dischargeDate(String discharge){
        String day= discharge.substring(0,2);
        String month= discharge.substring(3,5);
        String year= discharge.substring(6,10);
        System.out.println("Date of Month : "+day);
        System.out.println("Month : "+month);
        System.out.println("Year  : "+year);
    }
}
