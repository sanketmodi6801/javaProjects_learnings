package com.SanketEnterprise.java_practicals;
import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);

}
public class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;

        for(int i=1;i<=n;i++)
        {
            if (n%i==0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer : ");
        int s = sc.nextInt();

        AdvancedArithmetic obj = new MyCalculator();
        System.out.println("The sum of the divisor is : "+obj.divisorSum(s));

    }
}
