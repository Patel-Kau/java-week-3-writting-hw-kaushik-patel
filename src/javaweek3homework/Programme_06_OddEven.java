package javaweek3homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Programme_06_OddEven {


    public static void main(String[] args) {

        //Scanner declaration for reading input from console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = scanner.nextInt();

        Programme_06_OddEven oddeven = new Programme_06_OddEven();
        System.out.println(number + " is "+oddeven.isItEvenOrOddNumber(number) + " number");

        // Closing scanner object
        scanner.close();

    }

    // Checking the odd or even

    public String isItEvenOrOddNumber(int number){

        if(number %2 ==0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
