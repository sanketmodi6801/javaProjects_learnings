package com.SanketEnterprise.java_practicals;
import java.io.*;
import java.util.Scanner;
public class prt6_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character : ");
        String letter = sc.nextLine();
        int l =0;
        File file = new File("file3.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
        {
//            System.out.println(st);

            for (int p= 0; p<st.length();p++)
            {
                if (st.charAt(p) == (letter.charAt(0)))
                {
                    l++;
                }
            }
        }
        br.close();
        System.out.println(l);
    }
}
