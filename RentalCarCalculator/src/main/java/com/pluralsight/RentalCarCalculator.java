package com.pluralsight;


import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //final variables that will not change in the code
        final double BasicCarRental = 29.99;
        final double TolltagRate = 3.95;
        final double gpsRate = 2.95;
        final double roadsideAssist = 3.95;
        final double Surcharge = 0.30; // 30% charge for drivers under 25

        // user needs to enter pick up date
        System.out.println("Enter pick up date: ");
        String pickupDate = myScanner.nextLine(); //get user input
        System.out.println("----------------------------------");

        // user enters in number of days of rental
        System.out.print("Enter number of days for rental ($29.99/day): ");
        int rentalDays = myScanner.nextInt(); // get user input
        myScanner.nextLine();
        System.out.println("----------------------------------");

        double optionsCost = 0.00;

        // ask user for toll tag option
        System.out.println("Will you be using an electronic toll tag for $3.95/day? (yes/no): ");
        String tollTag = myScanner.nextLine();
        switch (tollTag.toLowerCase()) {
            case "yes":
                optionsCost += TolltagRate * rentalDays;
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid, will skip Toll Tag option.");
                break;
        }

        System.out.println("----------------------------------");

        // ask user for GPS option
        System.out.println("Will you be needing GPS for $2.95/day? (yes/no):");
        String gps = myScanner.nextLine();
        switch (gps.toLowerCase()) {
            case "yes":
                optionsCost += gpsRate * rentalDays;
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid, will skip GPS option.");
                break;
        }

        System.out.println("----------------------------------");

        // ask user for roadside assistance
        System.out.println("Will you be needing roadside assistance for $3.95/day? (yes/no): ");
        String roadside = myScanner.nextLine();
        switch (roadside.toLowerCase()) {
            case "yes":
                optionsCost += roadsideAssist * rentalDays;
                break;
            case "no":
                break;
            default:
                System.out.println("Invalid, will skip Roadside Assistance option.");
                break;
        }

        System.out.println("----------------------------------");

        // ask user for their age
        System.out.print("Please enter your age (30% surcharge for people under 25): ");
        int age = myScanner.nextInt();

        double baseCost = BasicCarRental * rentalDays;
        double surcharge = 0;

        if (age < 25) {
            surcharge = (baseCost + optionsCost) * Surcharge;
        }

        double totalCost = baseCost + optionsCost + surcharge;

        
        // results
        System.out.println("\n--- Rental Summary ---");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Car Rental Cost: $%.2f\n", baseCost);
        System.out.printf("Options Cost: $%.2f\n", optionsCost);
        System.out.printf("Underage Driver Surcharge Cost: $%.2f\n", surcharge);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
    }
}