package com.SanketEnterprise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_Handling {
    public static void main(String[] args) {

        // creating a object for the file
        File myFile = new File("xyzFile.txt");


        // creating a file
        try {
            myFile.createNewFile();

            // creating a file writer object...!!
            FileWriter fileWriter = new FileWriter("xyzFile.txt");
//            fileWriter.write(" Hii this is a new file creating by me.,,!!");
            fileWriter.append(" Hii this is a new file creating by me.,,!!");
            fileWriter.append(" \n adding some more text to the file..");
            fileWriter.close();

            // reading a file
            Scanner sc = new Scanner(myFile);
            int line=0; // for counting number of lines..!!
            while(sc.hasNextLine()){
                String Line = sc.nextLine();
                System.out.println(Line);
                line++;          // for counting number of lines.!!
            }
            System.out.println("The number of lines is : "+line);
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (myFile.delete()){
            System.out.println("file delted");
        }
        else{
            System.out.println("some problem occurred");
        }


    }
}
