package com.SanketEnterprise.java_practicals;

abstract class Birds {
    abstract void sparrow();
    abstract void crow();

    public static void main(String[] args) {
        sparrow obj = new sparrow();
        crow obj1 = new crow();
        obj.sparrow();
        obj1.crow();
    }
}
