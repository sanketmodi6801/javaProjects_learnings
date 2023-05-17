package com.SanketEnterprise.java_practicals;

class electriCar extends pr_car {
    double price = 500000;
}
public class pr_car {
    double price = 300000;

    void calculateSalesPrice(double price){
        System.out.println(price);
    }
    public static void main(String[] args) {
        pr_car obj = new pr_car();
        vintageCar obj1 = new vintageCar();
        electriCar obj2 = new electriCar();

        obj.calculateSalesPrice(obj.price);
        obj1.calculateSalesPrice(obj1.price);
        obj2.calculateSalesPrice(obj2.price);
    }
}
