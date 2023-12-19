package src.com.shpp.p2p.cs.vzablotskyi.assignment3;

import java.util.Scanner;

public class Assignment3Part2 {
    private static Scanner scanner = new Scanner(System.in);
    private static int n;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        try {
            n = scanner.nextInt();
            calculateTheSequenceOfHailstones(n);
        } catch (Exception e) {
            System.out.println("you entered an incorrect number, try again");
        }
    }

    /*If n is even, divide it by 2 If n is odd, multiply by 3 and add 1 Continue this process until n equals 1*/
    public static void calculateTheSequenceOfHailstones(int n) {
        int tmp = n;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(tmp + " is even so I take half: " + n);
            } else {
                n = n * 3 + 1;
                System.out.println(tmp + " is odd so I make 3n + 1: " + n);
            }
            tmp = n;
        }
    }
}
