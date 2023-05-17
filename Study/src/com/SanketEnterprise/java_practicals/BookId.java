package com.SanketEnterprise.java_practicals;

import java.util.Scanner;

public class BookId {
    private static String id;

    String setBookname()
    {
      return id.substring(0,4);
    }
    String setpubCode()
    {
        return id.substring(4,6);

    }
    String setTitleno()
    {
        return id.substring(6,10);
    }

    String getBookname(){return setBookname();}
    String getpubCode(){return setpubCode();}
    String getTitleno(){return setTitleno();}

    void display(){
        System.out.println("The book name is : "+getBookname()
                +"\nThe book publisher code is : "+ getpubCode()
                +"\nThe book title number is : "+getTitleno());
    }

    public static void main(String[] args) {

        System.out.print("Enter your 10 digit Book Id : ");
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        BookId book = new BookId();
        book.display();

    }
}
