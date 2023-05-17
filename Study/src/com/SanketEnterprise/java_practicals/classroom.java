package com.SanketEnterprise.java_practicals;

public class classroom {
    public classroom(){
        System.out.println("This constructor is being override...!!");
    }
    public classroom(int no,String type,int area, boolean machine){
        System.out.println("The room no is : "+no+" , The room type is :"+type+"" +
                " , Area is "+area+" sq.mtrs , Ac machine is : "+machine);
    }
    public static void main(String[] args) {
        classroom obj1= new classroom();
        classroom obj = new classroom(1,"B",400,false);
    }
}
