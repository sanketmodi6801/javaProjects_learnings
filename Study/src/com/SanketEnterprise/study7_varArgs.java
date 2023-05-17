package com.SanketEnterprise;

public class study7_varArgs {

    static int sum(int x,int y,int z,int...arr)
    {
        int result=x;
        for(int a:arr)
        {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("The sum is : "+sum(1,2,3,4,5));

    }
}
