package com.SanketEnterprise;
import java.util.Scanner;

public class study6_savingAccount {

    int balance;

    public study6_savingAccount(int initialBalance)
    {
     balance=initialBalance;
     System.out.println("Your current Balance is : "+balance);
    }

    public int deposit(int amountDeposit)
    {
        int amountdeposited = amountDeposit;
        amountdeposited += balance;
        return balance;
    }

    public int withdraw(int amountwithdraw)
    {
        int amountwithdrawed = amountwithdraw;
        amountwithdrawed += balance;
        return balance;
    }

    public static void main(String[] args) {
        System.out.println("Hello..!!\n\tWelcome to your Savings Account...!!");
        System.out.print("\n To check balance press 1\n To deposit money press 2\n To withdraw money press 3");

        Scanner sc = new Scanner(System.in);
        int keyPress = sc.nextInt();

        study6_savingAccount bank =new study6_savingAccount(0);

        if(keyPress==1)
        {

        }

        else if(keyPress==2)
        {
            System.out.print("Enter the amount to deposit : ");
            int dps =sc.nextInt();
            bank.deposit(dps);
        }

        else if(keyPress==3)
        {
            System.out.print("Enter the amount to withdraw : ");
            int wtd =sc.nextInt();
            bank.withdraw(wtd);
        }
        else
        {
            System.out.println("Enter a valid number!! ");
        }

    }
}
