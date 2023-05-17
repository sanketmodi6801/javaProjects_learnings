package com.SanketEnterprise;

import java.io.*;
import java.util.Scanner;

public class personal_logger {
    public static void main(String[] args) throws IOException {

        File bank = new File("bank.txt");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select your choice : \n\t 1 for Credit \n\t 2 for Debit \n\t 3 for View Balance \n\t Press 0 to Quit");
            int s = sc.nextInt();

//            for crediting money !
            if (s == 1) {
                System.out.println("Enter the amount to credit : ");
                int ss = sc.nextInt();
                String ll = null;
                BufferedReader reader = new BufferedReader(new FileReader(bank));
                String line;
                while ((line = reader.readLine()) != null) {
                    ll = line;
                }
                FileWriter fl = new FileWriter("bank.txt");
                int str = Integer.parseInt(ll) + ss;
                fl.append(Integer.toString(str));
                fl.close();
            }
//        for debiting  money !
            else if (s == 2) {
                System.out.println("Enter the amount to Debit : ");
                int d = sc.nextInt();
                String v = null;
                BufferedReader reader1 = new BufferedReader(new FileReader(bank));
                String lin;
                while ((lin = reader1.readLine()) != null) {
                    v = lin;
                }
                FileWriter f2 = new FileWriter("bank.txt");
                int stx = Integer.parseInt(v) - d;
                f2.append(Integer.toString(stx));
                f2.close();
            }

//        for reading balance !
            else if (s == 3) {
                Scanner bal = new Scanner(bank);
                while (bal.hasNextLine()) {
                    String balance = bal.nextLine();
                    System.out.println(balance);
                }
                bal.close();
            }
            else if (s == 0) {
                break;
            }
        }
    }
}
