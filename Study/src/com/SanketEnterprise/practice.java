package com.SanketEnterprise;
import java.util.Scanner;

//public class practice {
//
////     practice of varArgs..!!
//
//    static int addition(int... arr) {
//        int result = 0;
//        for (int a : arr) {
//            result += a;
//        }
//        return result;
//
//    }
//    public static void main(String[] args) {
//
//        System.out.println("The addition of two numbers is : " +addition(3,4,50,60));
//    }


//    int salary;
//    String name;
//
//    public int getSalary() {
//        return salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String s) {
//        name = s;
//        System.out.println(s);
//    }

//    public static void main(String[] args) {
//        practice sal = new practice();
//        sal.salary = 100;
//        sal.name = "Sanket Modi";
//        System.out.println(sal.getName());
//        System.out.println(sal.getSalary());
//
//    }
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n=sc.nextInt();
//    int sum=0;
//    int a=2;
//    for(int i =1;i<=n;i++)
//    {
//       sum=sum+a;
//       a+=2;
//    }
//    System.out.println(sum);

//    static int x = 0;
//
//    private static int True() {
//        return 1;
//    }
//
//    private static int False() {
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        int n = (x == 2) ? True() : False();
//        System.out.println(n);
//    }
//}

interface interface1{
    void method1();
}
interface interface2 extends interface1{
    void method2();
}
