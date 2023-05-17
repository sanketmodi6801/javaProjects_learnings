package com.SanketEnterprise;
import java.util.Random;
public class choice {

    public static void main(String[] args)
    { Random ran = new Random();
        int num=ran.nextInt(3);
        String statement ="";
        if(num==0)statement="you opt for maths, and you have to learn it!!\n go work hard on it....";
        else if(num==1)statement="B.E. is not good, but you are good at physics. so must learn B.E.";
        else statement="So, programming is your love!! grab your heart over it!!\n write the fucking code straight away ;)";
        System.out.println(statement);
    }
}
