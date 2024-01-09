package com.shpp.p2p.cs.vzablotskyi.assignment3;

import java.util.Scanner;

public class Assignment3Part3 {
    private static double base;
    private static int exponent;

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("enter the number to be raised to a power: ");
            base = scanner.nextDouble();
            System.out.println();
            System.out.print("enter a power for the numbers: ");
            exponent = scanner.nextInt();
            Assignment3Part3 assignment3Part3 = new Assignment3Part3();
            assignment3Part3.raiseToPower(base, exponent);
        } catch (Exception e) {
            System.out.println("you entered an incorrect number, try again");
        }
    }

    /*we get two numbers (the pure number that needs to be raised to a power and the power itself), calculate the
     result, and print it to the console. If the degree is zero, then we print 1.*/
    private double raiseToPower(double base, int exponent) {
        double result = base;
        if(exponent == 0) {
            System.out.println(1);
            return 1;
        } else if (exponent < 0) {
            for (int i = 1; i < exponent * -1; i++) {
                result = result * base;
            }
            result = 1 / result;
        }
        else {
            for (int i = 1; i < exponent; i++) {
                result = result * base;
            }
        }
        System.out.println(result);

        return result;
    }
}