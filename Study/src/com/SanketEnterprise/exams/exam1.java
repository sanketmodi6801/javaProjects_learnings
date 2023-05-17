package com.SanketEnterprise.exams;

import java.util.ArrayList;
import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int attempts=0;

        ArrayList<String> keywords = new ArrayList<String>();
        keywords.add("for");
        keywords.add("while");
        keywords.add("break");
        keywords.add("public");

        System.out.print(" Enter your name :");
        String name = sc.nextLine();

        System.out.println("For logging into the system, you must enter any three " +
                "programming keywords \n such as 'for', 'void','print', etc...!!!");
        System.out.print("Enter first keyword : ");
        String first = sc.nextLine();

        System.out.print("Enter second keyword : ");
        String second = sc.nextLine();

        System.out.print("Enter third keyword : ");
        String third = sc.nextLine();

        for (int i = 0; i < keywords.size(); i++) {
            if (keywords.get(i).equals(first))
            {
                attempts++;
                break;
            }
        }for (int i = 0; i < keywords.size(); i++) {
            if (keywords.get(i).equals(second))
            {
                attempts++;
                break;
            }
        }for (int i = 0; i < keywords.size(); i++) {
            if (keywords.get(i).equals(third)) {
                attempts++;
                break;
            }
        }
        if (attempts>=2){
            System.out.println("You are given access to the system!!");
        }
        else
        {
            System.out.println("You must practice your programming skills!!");
        }
    }
}
