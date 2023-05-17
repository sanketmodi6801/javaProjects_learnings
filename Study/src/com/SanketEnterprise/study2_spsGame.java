package com.SanketEnterprise;

import java.util.Random;
import java.util.Scanner;

public class study2_spsGame
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO!!\nWelcome to stone paper scissor game...!!");
        System.out.println("~~GAME GUIDE CLICK, \n0 FOR STONE\n1 FOR PAPER\n2 FOR SCISSOR\n");


         /*
         computer ;  0 = stone , 1 = paper ,2 = scissor;
         user     ;  0 = stone , 1 = paper ,2 = scissor;
        */
        int loop;
        for(loop=1;loop<=5;loop++) {
            int num = rand.nextInt(3);

            System.out.print("PLEASE CHOOSE A NUMBER :");
            int input = sc.nextInt();


            if (num == 0 && input == 1) {
                System.out.println("YOU SELECTED PAPER....");
                System.out.println("COMPUTER SELECTED STONE....");
                System.out.println("SO, YOU GOT A WIN\n");
            } else if (num == 1 && input == 2) {
                System.out.println("YOU SELECTED SCISSOR....");
                System.out.println("COMPUTER SELECTED PAPER....");
                System.out.println("SO, YOU GOT A WIN\n");
            } else if (num == 2 && input == 0) {
                System.out.println("YOU SELECTED STONE....");
                System.out.println("COMPUTER SELECTED SCISSOR....");
                System.out.println("SO, YOU GOT A WIN\n");
            } else if (num == input) {
                System.out.println("BOTH ENTRIES ARE SAME!!\nIT'S A DRAW\nTRY SOMETHING DIFFERENT NEXT TIME..!!\n");

            }else if(input>2)
            {
                System.out.println("PLEASE ENTER A VALID NUMBER!!!");
            }
            else {
                if (num == 0 && input == 2) {
                    System.out.println("COMPUTER SELECTED STONE!!");
                    System.out.println("YOU SELECTED SCISSOR!!");
                } else if (num == 1 && input == 0) {
                    System.out.println("computer is showing paper!!");
                    System.out.println("YOU SELECTED STONE!!");
                } else {
                    System.out.println("computer is showing scissor!!");
                    System.out.println("YOU SELECTED PAPER!!");
                }


                System.out.println("SO, YOU GOT DEFEAT!!");
            }
        }
    }
}
