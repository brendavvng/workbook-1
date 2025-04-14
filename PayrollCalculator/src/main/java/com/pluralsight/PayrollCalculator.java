package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        //fire up the scanner to allow me to collect input from user
        Scanner myScanner = new Scanner(System.in);

        //ask user what their name is
        System.out.println("What is your name?");

        String name = myScanner.nextLine();

        //ask user what are their hours worked?
        System.out.println("Enter in hours worked: ");

        //get the hours worked entered and store it in hoursWorked
        float hoursWorked = myScanner.nextFloat();

        //ask user what are their pay rate is
        System.out.println("What is the pay rate? ");

        //get the user pay rate
        float payRate = myScanner.nextFloat();

        //if you wanted, you could do below to get gross pay:
        //double = grossPay = hoursWorked * payRate;

        //printf output: display employee's name and calculate their gross pay
        System.out.printf("%s made %.2f in gross pay", name, hoursWorked * payRate);

        //output with println below
        //System.out.println(name + " made $" + hoursWorked * payRate + :in gross pay");

    }
}
