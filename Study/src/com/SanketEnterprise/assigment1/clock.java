package com.SanketEnterprise.assigment1;
import java.util.Scanner;
class clock {
    static Scanner sc = new Scanner(System.in);
    void setTime(int hr, int min,int sec){
        String meridian;
        if (hr>=12){
            hr -= 12;
            meridian="Pm";
        }
        else {
            meridian="Am";
        }
        System.out.println("The time is "+hr+":"+min+":"+sec+":"+meridian);
    }
    public static void main(String[] args) {
        int hr,min,sec;
        clock set = new clock();
        System.out.println("Enter hours : ");
        hr = sc.nextInt();
        System.out.println("Enter minutes: ");
        min = sc.nextInt();
        System.out.println("Enter seconds : ");
        sec = sc.nextInt();
        if(hr <= 24  && min <= 60 && sec <= 60 ){
            set.setTime(hr,min,sec);
        }
        else{
            System.out.println("Invalid time entered...!!");
        }
    }
}
