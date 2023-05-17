package com.SanketEnterprise.java_practicals;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prt6_1 {
    public static void main(String[] args) {

        int a=0,b=0,c=0;

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();

            Scanner sc = new Scanner(file1);
            Scanner st = new Scanner(file2);
            Scanner ss = new Scanner(file3);

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                a++;
            }
            while (st.hasNextLine()) {
            String line = st.nextLine();
                b++;
            }while (ss.hasNextLine()) {
            String LIE = ss.nextLine();
                c++;
            }

            System.out.println("Number of lines in " +file1.getName() +" is : "+a);
            System.out.println("Number of lines in " +file2.getName() +" is : "+b);
            System.out.println("Number of lines in " +file3.getName() +" is : "+c);
            sc.close();
            st.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
