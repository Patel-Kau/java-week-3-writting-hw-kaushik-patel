package javaweek3homework;

import java.util.Scanner;

/**
 * 1. Write a java program that tells ua that input number ia odd or even
 * Hint: Use Ternary operator(?:)
 */
public class Programme_01_OddEvenTernaryOperator {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number
        );
        //closing the scanner object
        scanner.close();
    }

    //checking the number is even of odd
    public static void isItOddOrEvenNumber(int number) {
        // ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");

    }
}
