package com.SanketEnterprise.java_practicals;

interface pr4_circle{
 void shape();
 void Area();
}
interface pr4_rectangle{
    void shape();
    void Area();
}

interface pr4_shape{
    void typeOfShape();
}

interface pr4_sign{
   void sign();
}
class circles implements pr4_circle{
    int radius;
    String color,shape;
    circles(){
        radius=10;
        shape="circle";
        color="red";
    }
   public void shape(){
       System.out.println("The shape is "+shape+" with color "+color+" and radius "+radius+" units");
    }
    public void Area(){
        System.out.println("The area is "+(3.14*radius*radius)+" sq units.");
    }
}

class rectangles implements pr4_rectangle{
    int length,breadth;
    String color,shape;
    rectangles(){
        length=10;
        breadth=30;
        shape="rectangle";
        color="blue";
    }
    public void shape(){
        System.out.println("The shape is "+shape+" with color "+color+" and length "+length+" units and breadth "
                +breadth+" units");
    }

    public void Area(){
        System.out.println("The area is "+(length*breadth));
    }
}

class shapes implements pr4_shape{
    public void typeOfShape(){
        System.out.println(" Here are circles ans rectangles..!!");
    }
}
class signs implements pr4_sign{
    public void sign() {
        System.out.println(" by sanket modi..!!");
    }
}
class pr4_6 {
    public static void main(String[] args) {
        pr4_circle c1= new circles();
        pr4_rectangle r1= new rectangles();
        pr4_shape s1= new shapes();
        pr4_sign ss1= new signs();
        c1.shape();
        c1.Area();
        r1.shape();
        r1.Area();
        s1.typeOfShape();
        ss1.sign();

    }
}
