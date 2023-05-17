package com.SanketEnterprise.java_practicals;
public class salesman {
    String firstName, lastName;
    double salary;
    public salesman() {
        firstName="";
        lastName= "";
        salary=0;
    }
    public salesman(String fName, String lName, double sal) {
       setFirstName(fName);
       setLastName(lName);
       setSalary(sal);
    }

    void setFirstName(String f){
        firstName=f;
    }
    void setLastName(String l){
        lastName=l;
    }
    void setSalary(double sal){
        salary=sal;
        if (salary <= 0) {
            salary = 0.0;
        }
    }
    String getFirstName() {return firstName;}
    String getLastName() {return lastName;}
    double getSalary() {return salary;}

    void display(){
        System.out.println("First name : "+getFirstName());
        System.out.println("Last name  : "+getLastName());
        System.out.println("Salary     : "+getSalary());

    }
    void raise(){
        System.out.println("yearly salary before raise : "+salary*12);
        System.out.println("Yearly Salary after raise : "+(salary*12+(salary*12)*10)/100);
    }

}
