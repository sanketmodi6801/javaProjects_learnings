package com.SanketEnterprise;

import java.util.Scanner;

public class study1_leapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        for(num=0;num<=5;num++)
        {
            System.out.print("Enter the year : ");
            int year = sc.nextInt();
            
            if(year % 4 ==0)
            {
                System.out.println("The year is leap year!!");
            }
            else
            {
                System.out.println("The year is not a leap year!!");
            }

        }
    }
}
