package com.SanketEnterprise.java_practicals;

import java.util.Scanner;

//public class prt1_6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the numbers : ");
//        int num, a=0 , sum =0;
//        num = sc.nextInt();
//        while(num !=0){
//            sum += num;
//            ++a;
//            num = sc.nextInt();
//        }
//        float avg = (float)sum/a;
//        System.out.println("The average is "+avg);
//    }
//}

public class prt1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of elements in the sequence : ");
        int amt = sc.nextInt();
        int sum = 0;
        int [] arr = new int[amt];
        System.out.print("Now, \n Enter the elements of the sequence one by one :");

        for(int i=0; i< arr.length;i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        float avg =(float) sum/ arr.length;
        System.out.println("The average is : "+avg);
    }
}