package com.SanketEnterprise.java_practicals;
import java.util.Scanner;

public class pr4_marks {
    private Scanner sc;
    public static void main(String[] args) {
        pr4_marks obj = new pr4_marks();
        obj.sc = new Scanner(System.in);
        System.out.println("Enter total number of students : ");
        int totalStudents = obj.sc.nextInt();
        obj.getAverage(totalStudents);
    }

    private void getAverage(int totalStudents){
        // entering marks of each students..!!
        int [] marks = new int[totalStudents];
        int i=0;
        double sum=0;

        while(i<totalStudents) {
            System.out.printf("ENTER MARKS OF STUDENT %d : ", i + 1);
            int grade = sc.nextInt();
            if (grade>=0 && grade<=100){
                marks[i] = grade;
                sum += marks[i];
                i++;
                continue;
            }
            System.out.println("Invalid marks provided, try again...!!!");
        }
        int average = (int)sum/totalStudents;
        System.out.printf("THE AVERAGE MARKS IS %d ",average);
    }
}