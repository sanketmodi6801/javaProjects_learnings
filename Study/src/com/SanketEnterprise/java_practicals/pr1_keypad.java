package com.SanketEnterprise.java_practicals;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
import java.util.*;

public class pr1_keypad {
//    public static void Show(String ...arr){
//        String [] array = new String[0];
//        for (String a : arr){
//            array = new String[]{a};
//        }
//        System.out.println(Arrays.toString(array));
//    }
    public static void main(String[] args) {
        System.out.println("Please enter any string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        long var=0;
        List<String> arr = new ArrayList<String>();

        for (String s : str.split("")) {
//            System.out.println(s);

            if(s.equals("a") || s.equals("b") || s.equals("c")){
//                System.out.println("2");
//               Show("2");
//               var =(var*10)+2;
                arr.add("2");


            }
           else if(s.equals("d") || s.equals("e") || s.equals("f")) {
//                System.out.println("3");
//                Show("3");
//                var =(var*10)+3;
                arr.add("3");
            }
            else if(s.equals("g") || s.equals("h") || s.equals("i")) {
//                System.out.println("4");
//                Show("4");
//                var =(var*10)+4;
                arr.add("4");
            }
            else if(s.equals("j") || s.equals("k") || s.equals("l")) {
//                System.out.println("5");
//                Show("5");
//                var =(var*10)+5;
                arr.add("5");
            }
            else if(s.equals("m") || s.equals("n") || s.equals("o")) {
//                System.out.println("6");
//                Show("6");
//                var =(var*10)+6;
                arr.add("6");
            }
            else if(s.equals("p") || s.equals("q") || s.equals("r") || s.equals("s")) {
//                System.out.println("7");
//                Show("7");
//                var =(var*10)+7;
                arr.add("7");
            }
            else if(s.equals("t") || s.equals("u") || s.equals("v")) {
//                System.out.println("8");
//                Show("8");
//                var =(var*10)+8;
                arr.add("8");
            }
            else if(s.equals("w") || s.equals("x") || s.equals("y") || s.equals("z")) {
//                System.out.println("9");
//                Show("9");
//                var =(var*10)+9;
                arr.add("9");
            }
        }
        System.out.println(arr);
    }
}
