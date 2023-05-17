package com.SanketEnterprise.java_practicals;
import java.util.Scanner;
public class pr_videotape {

    private static String title,classification;
    private static int time;

    String Title(){
        return title;
    }
    String Classification(){
        return classification;
    }
    String Time(){
        return String.valueOf(time);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        pr_videotape obj = new pr_videotape();
        System.out.println("Enter the title of tv show :");
        title = sc.nextLine();
        System.out.println("Enter the type of show :");
        classification= sc.nextLine();
        System.out.println("Enter the time duration of video :");
        time = sc.nextInt();
        String x = obj.Title();
        String y = obj.Classification();
        String z=  obj.Time();
        System.out.println(x+" "+(y)+" "+z);

    }
}
