package com.SanketEnterprise.exams;

public class fruit {

    public static void main(String args[])
    {
        Thr1 th1=new Thr1();
        Thr2 th2=new Thr2();
        Thr3 th3=new Thr3();
        Thr4 th4=new Thr4();
        Thr5 th5=new Thr5();
        Thr6 th6=new Thr6();
        Thr7 th7=new Thr7();
        Thr8 th8=new Thr8();
        th1.start();
        th2.start();

        th3.start();
        th4.start();

        th5.start();
        th6.start();

        th7.start();
        th8.start();
    }
}

class Thr1 extends Thread {

    public void run()
    {
        int i=1;
        while(i<3){
            i++;
            System.out.println("Producer has produce Apple");
        }
    }

}

class Thr2 extends Thread {

    public void run()
    {int i=1;
        while(i<3){
            i++;
            System.out.println("Consumer has consumed apple");
        }

    }

}

class Thr3 extends Thread {

    public void run()
    {int i=1;
        while(i<3){
            i++;
            System.out.println("Producer has produce Orange");
        }
    }

}

class Thr4 extends Thread {

    public void run()
    {int i=1;
        while(i<3){
            i++;
            System.out.println("Consumer has consumed Orange");
        }

    }

}


class Thr5 extends Thread {

    public void run()
    {int i=1;
        while(i<3){
            i++;
            System.out.println("Producer has produce Papaya");
        }
    }

}

class Thr6 extends Thread {

    public void run()
    {int i=1;
        while(i<3){
            i++;
            System.out.println("Consumer has consumed Papaya");
        }

    }

}

class Thr7 extends Thread {

    public void run()
    {int i=1;
        while(i<3){
            i++;
            System.out.println("Producer has produce Watermelon");
        }
    }

}

class Thr8 extends Thread {

    public void run()
    {
        int i=1;
        while(i<3){
            i++;
            System.out.println("Consumer has consumed Watermelon");
        }

    }

}