package com.SanketEnterprise;
import java.util.Scanner;

public class like_Dislike {

    public static void main(String[] args) {

        String a;
        String p;
        int sum=0;

        Scanner sc =new Scanner(System.in);
        for(int i=0;i<=6;i++) {
            a = sc.nextLine();
            p = sc.nextLine();

            if (a == p) {
                sum++;
            }
        }
        System.out.println(sum);



    }
}
