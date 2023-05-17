package com.SanketEnterprise.java_practicals;
interface student {

    default void branch(){
        String branch="B.Tech";
        System.out.println("The student is in "+branch+" branch");
    }
    default void result(){
        int result=90;
        System.out.println("result is : "+result);
    }
}
