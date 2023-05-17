package com.SanketEnterprise;

public class study5_array_practiceSet {
    public static void main(String[] args) {

        //1st problem make a array of 5 and calculate their sum
//        int [] marks ={45,40,90,50,100};
//        int sum=0;
//        for(int element : marks)
//        {
//             sum = sum + element;
//        }
//        System.out.println("the sum is :"+sum);

        //2nd problem , check whether the given number is within the array

//        int [] num={3,4,7,8,9,5};
//        boolean check =false;
//        int newNum = 15;
//        for(int elements:num)
//        {
//            if(newNum==elements)
//            {
//                check=true;
//                break;
//            }
//        }
//        if(check)
//        {
//            System.out.println("the number is present in the array!!");
//        }
//        else
//        {
//            System.out.println("the number is not present in the array.!!");
//        }

        //3rd problem average marks of a subject
        

//        int[] marks ={45,60,59,30,45};
//        int sum =0;
//
//        for(int element:marks)
//        {
//            sum +=element;
//        }
//        System.out.println("your marks are :"+sum);
//        System.out.println("your average marks are :"+sum/marks.length);
//

                // Practice Problem 1
        /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


        // Practice Problem 2
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }


        // Practice Problem 3

        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of average marks is " + sum/marks.length);


        // Practice Problem 4
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};

        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0;i<mat1.length;i++){ // row number of times
            for (int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); // Prints a new line
        }



        // Practice Problem 5
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

        // Practice Problem 6
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        */
                // Practice Problem 7
//                boolean isSorted = true;
//                int [] arr = {1, 12, 3, 4, 5, 34, 67};
//                for(int i=0;i<arr.length-1;i++){
//                    if(arr[i] > arr[i+1]){
//                        isSorted = false;
//                        break;
//                    }
//                }
//                if(isSorted){
//                    System.out.println("The Array is sorted");
//                }
//                else{
//                    System.out.println("The Array is not sorted");
//                }



        // problem 5 again
//        int []array ={1,2,3,4,5,6};
//        int l =array.length;
//        int n=Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n;i++)
//        {
//            temp=array[i];
//            array[i]=array[l-1-i];
//            array[l-1-i]=temp;
//        }
//        for(int element :array)
//        {
//            System.out.println(element);
//        }

//        int []two={6,5,4,3,2,1};
//        int l=two.length;
//        int m=Math.floorDiv(l,2);
//        int temp;
//
//        for(int i=0;i<m;i++)
//        {
//            temp=two[i];
//            two[i]=two[l-1-i];
//            two[l-1-i]=temp;
//        }
//        for(int one :two)
//        {
//            System.out.println(one);
//        }

        
    }
}
