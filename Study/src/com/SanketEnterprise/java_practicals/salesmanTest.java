package com.SanketEnterprise.java_practicals;

public class salesmanTest extends salesman {
    public static void main(String[] args) {
        salesman obj = new salesman("aston","martin",50000);
        obj.display();
        obj.raise();
//        obj.setFirstName("sanket");
        salesman obj1 = new salesman("mars","jupiter",500);
        obj1.display();
        obj1.raise();
//        System.out.println(obj.getFirstName());

    }
}
