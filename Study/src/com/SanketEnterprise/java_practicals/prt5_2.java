package com.SanketEnterprise.java_practicals;
import java.lang.Exception;

class MyException extends Exception{
    public MyException(String param){
        super(param);
    }
}

public class prt5_2  extends Exception{
    public static void main(String[] args) {
        try {
//            int a=5/0;
            String s="hellllooooooo";
            System.out.println(s.charAt(9));
            throw new MyException("blah blah blah...");
        }
        catch(MyException e){
            System.out.println(e.getMessage());
            System.out.println("MyException["+e.getMessage()+"]");
        }
        catch(ArithmeticException e) {
            System.out.println("Invalid Divison");
        }
        catch(NumberFormatException e){
            System.out.println("Format mismatched");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Index is invalid");
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Array index is invalid");
        }
    }
}
