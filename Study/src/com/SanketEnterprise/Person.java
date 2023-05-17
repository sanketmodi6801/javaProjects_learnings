package com.SanketEnterprise;
import java.util.Scanner;

public class Person{
    Scanner sc= new Scanner(System.in);
    String fname;
    String lname;
    int age;

    public void getData(){
        System.out.println("Please enter your first name here:");
        this.fname=sc.nextLine();
        System.out.println("Please enter your last name here:");
        this.lname=sc.nextLine();
        System.out.println("Please enter your age:");
        this.age=sc.nextInt();
    }
    public void printData(){
        System.out.println("Fname:"+fname);
        System.out.println("Fname:"+lname);
        System.out.println("Fname:"+age);
    }
    public static void main(String[] args) {
        Staff staffObj = new Staff();
        System.out.println("Staff input");
        staffObj.getData();
        Faculty facultyObj= new Faculty();
        System.out.println("faculty input");
        facultyObj.getData();
        Student studentObj=new Student();
        System.out.println("student input");
        studentObj.getData();

        staffObj.displayData();
        facultyObj.displayData();
        studentObj.displayData();



    }
}
class Student extends Person{
    String branch;
    String rollNo;

    public void getData(){
        super.getData();
        System.out.println("Please enter your branch here:");
        this.fname=sc.nextLine();
        System.out.println("Please enter your rollNohere:");
        this.lname=sc.nextLine();
    }

    public void displayData(){
        super.printData();
        System.out.println("Branch: "+branch);
        System.out.println("Roll Number: "+rollNo);
    }
}
class Employee extends Person{
    String eNo;
    String doj;

    public void getData(){
        super.getData();
        System.out.println("Please enter your employee no here:");
        this.fname=sc.nextLine();
        System.out.println("Please enter your date of joining here:");
        this.lname=sc.nextLine();
    }

    public void displayData(){
        super.printData();
        System.out.println("Employee No: "+eNo);
        System.out.println("Date of Joining: "+doj);
    }
}

class Staff extends Employee{
    String designation;

    public void getData(){
        super.getData();
        System.out.println("Please enter your designation here:");
        this.fname=sc.nextLine();
    }
    public void displayData(){
        super.displayData();
        System.out.println("Designation: "+designation);
    }
}

class Faculty extends Employee{
    String designation;

    public void getData(){
        super.getData();
        System.out.println("Please enter your designation here:");
        this.fname=sc.nextLine();
    }

    public void displayData(){
        super.displayData();
        System.out.println("Designation: "+designation);
    }
}
