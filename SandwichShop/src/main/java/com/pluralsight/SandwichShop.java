package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        double regularPrice = 5.45;
        double largePrice = 8.95;
        double basePrice = 0.0;


        //ask user for sandwich size
        System.out.println("Please select a sandwich size: ");
        System.out.println("1. Regular: $5.45");
        System.out.println("2. Large: 8.95");
        System.out.print("Enter size (1 or 2): ");
        int size = myScanner.nextInt();

        if (size ==1) {
            basePrice = regularPrice;
        } else if (size ==2) {
            basePrice = largePrice;
        } else {
            System.out.println("Invalid input, try again.");
            return; // this returns to first part
        }

        //ask for age
        System.out.print("How old are you?: ");
        int age = myScanner.nextInt();

        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10; // 10% discount for students
        } else if (age >= 65) {
            discount = 0.20; // 20% discount for seniors
        }

        double finalPrice = basePrice - (basePrice * discount);

        System.out.printf("The total cost of your sandwich is: $%.2f", finalPrice);
    }



    }
