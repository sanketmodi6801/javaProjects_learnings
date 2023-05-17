package com.SanketEnterprise;

//import java.util.Arrays;

public class study4_Arrays {
    public static void main(String[] args) {

//        making of arrays...

//        method 1.)declaration & memoery allocation
//            int []num =new int[5];

//        method 2.)declaration & then memory allocation & then initializing
//                int []num;
//                num= new int[5];

        //initializing
//            num[0]=1;
//            num[1]=2;
//            num[2]=3;
//            num[3]=4;
//            num[4]=5;

//        method 3.)declaration, memory allocation & initialializing
        int[] num = {1, 2, 3, 4, 5};

//        System.out.println(num[2]);
//        System.out.println(Arrays.toString(num));

        // to display arrays
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
//
//             aa method ma 500 enteries hoy to ene ek ek karine print naa karay ena mate loops use karvana!

//        for(int n=0;n<num.length;n++)
//        {
//            System.out.println(num[n]);
//        }

        // reverse ma joiye to!!
//        for(int n=num.length - 1;n>=0;n--)
//          {
//          System.out.println(num[n]);
//          }

//        for each loop no use karvano... aa loop ma array na badha j elements aayi jaay...
//        for(int element:num)
//        {
//            System.out.println(element);
//        }

//          //making of 2-D Arrays

            int [][]flats = new int[2][5];
            flats[0][0]=101;
            flats[0][1]=102;
            flats[0][2]=103;
            flats[0][3]=104;
            flats[0][4]=105;
            flats[1][0]=201;
            flats[1][1]=202;
            flats[1][2]=203;
            flats[1][3]=204;
            flats[1][4]=205;

        //System.out.println(Arrays.toString(flats[1]));


//        System.out.println(flats[0][1]);

        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
            System.out.print(flats[i][j]);
              System.out.print(" ");
        }
        System.out.println(" ");
        }
    }

}
