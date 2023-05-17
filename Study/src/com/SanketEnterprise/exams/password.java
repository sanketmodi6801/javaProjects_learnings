package com.SanketEnterprise.exams;

import java.util.*;

public class password
{

    public static void main(String args[]){
        ArrayList<String> keywords=new ArrayList<String>();//Creating arraylist
        keywords.add("null");//Adding object in arraylist
        keywords.add("is");
        keywords.add("for");
        keywords.add("vector");

        String word [] = {"","",""};
        for(int i = 0; i < 3 ; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter "+(i+1)+"st word : ");
            word[i] = sc.next();
        }

        boolean flag [] = {false,false,false};
        for(int j = 0; j<3 ; j ++ )
        {
            for(int i = 0 ; i < keywords.size();i++)
            {
                if(keywords.contains(word[j]))
                {
                    flag[j] = true;
                    break;
                }
            }

        }

        int totalFlag = 0;

        for(int i = 0 ; i < 3 ; i++)
        {
            if(flag[i])
            {
                ++totalFlag;
            }
        }

        if(totalFlag >= 2)
        {
            System.out.println("\nCongrats you can now use the application and its services .");

        }
        else
        {
            System.out.println("\nSorry you will require more tech knowledge about languages .");
        }
    }

}