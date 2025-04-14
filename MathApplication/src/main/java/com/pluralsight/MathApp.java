package com.pluralsight;

public class MathApp {

    //this is the main method and where my code will run from
    //all code I am typing for this exercise will be in this method
    public static void main(String[] args) {

        /*
1. Create two variables to represent the salary for Bob and Gary, name them
bobSalary and garySalary. Create a new variable named
highestSalary. Determine whose salary is greater using Math.max() and
store the answer in highestSalary. Set the initial salary variables to any value
you want. Print the answer (i.e "The highest salary is ...")

         */

        int bobSalary = 55000;
        int garySalary = 100000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        System.out.println("-------------------------------------------");

        /*
        2. Find and display the smallest of two variables named carPrice and
truckPrice. Set the variables to any value you want
         */

        int carPrice = 32000;
        int truckPrice = 44000;

        System.out.println("The lowest price is " + Math.min(carPrice, truckPrice));

        System.out.println("-------------------------------------------");

        /*

        3. Find and display the area of a circle whose radius is 7.25

         */
        double radius = 7.25;
        double area = Math.PI * radius * radius;
/*
Could also use this for the area:
double area = Math.PI * Math.pow(radius, 2);
 */
        System.out.println("The area of the circle is: " + area);

        System.out.println("-------------------------------------------");


        /*

        4. Find and display the square root a variable after it is set to 5.0

         */

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of the number is: " + squareRoot);

        System.out.println("-------------------------------------------");

        /*

        5. Find and display the distance between the points (5, 10) and (85, 50)

        distance=(x2−x1)2+(y2−y1)2 formula

         */
        //could also use "byte" for the variables
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        //distance=(85−5)2+(50−10)2=802+402=6400+1600=8000≈89.44
        System.out.println("The distance between the points is: " + distance);

        System.out.println("-------------------------------------------");

        /*

        6. Find and display the absolute (positive) value of a variable after it
        is set to -3.8

         */

        double num = -3.8;
        double absoluteValue = Math.abs(num);
        //this just returns the positive number of the value - math.abs
        System.out.println("The absolute value is: " + absoluteValue);


        System.out.println("-------------------------------------------");

        /*

        7. Find and display a random number between 0 and 1

         */

        double number1 = Math.random();
        //Math.random generates number from 0.0 (inclusive) to 1.0 (exclusive)
        System.out.println("The random number between 0 to 1 is:" + number1);

        //alt formula: System.out.println("a random number between 0 and 1: " + Math.random());

        System.out.println("-------------------------------------------");



    }

}
