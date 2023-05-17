package com.SanketEnterprise.exams;

class TakeANumber {
    private int next = 0;     // Next place in line
    private int serving = 0;  // Next customer to serve

    public synchronized int nextNumber(int custId) {
        next = next + 1;
        System.out.println( "Customer " + custId + " takes ticket " + next );
        return next;
    } // nextNumber()
    public synchronized int nextCustomer() {
        ++serving;
        System.out.println("  Clerk serving ticket "
                + serving );
        return serving;
    } // nextCustomer()
    public synchronized boolean customerWaiting() {
        return next > serving;
    } // customerWaiting()
} // TakeANumber

class Clerk extends Thread {
    private TakeANumber takeANumber;

    public Clerk(TakeANumber gadget) {
        takeANumber = gadget;
    }
    public void run() {
        while (true) {
            try {
                sleep( (int)(Math.random() * 1000));
                if (takeANumber.customerWaiting())
                    takeANumber.nextCustomer();
            } catch (InterruptedException e) {
                System.out.println("Exception: "+e.getMessage());
            }
        } // while
    } // run()
} // Clerk

class Customer extends Thread {

    private static int number = 10000; // Initial ID number
    private int id;
    private TakeANumber takeANumber;

    public Customer( TakeANumber gadget ) {
        id = ++number;
        takeANumber = gadget;
    }

    public void run() {
        try {
            sleep((int)(Math.random() * 2000));
            takeANumber.nextNumber(id);
        } catch (InterruptedException e) {
            System.out.println("Exception: "+ e.getMessage());
        }
    } // run()
} // Custome

public class Bakery {
    public static void main(String args[]) {
        System.out.println("Starting clerk and customer threads");
        TakeANumber numberGadget = new TakeANumber();
        Clerk clerk = new Clerk(numberGadget);
        clerk.start();
        for (int k = 0; k < 5; k++) {
            Customer customer = new Customer(numberGadget);
            customer.start();
        }
    } // main()
} // Bakery