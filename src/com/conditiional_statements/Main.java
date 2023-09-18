package com.conditiional_statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // Question: 1
        // int age = sc.nextInt();
        //
        // if (age > 18) {
        //     System.out.println("You are an adult");
        // } else {
        //     System.out.println("You are not an adult");
        // }

        // // Question: 2
        // int num = sc.nextInt();
        //
        // if (num%2 == 0) {
        //     System.out.println("The number is even");
        // } else {
        //     System.out.println("The number is odd");
        // }

        // Question: 3
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        //
        // if (a == b) {
        //     System.out.println("Equal");
        // } else {
        //     if (a > b) {
        //         System.out.println("a is greater");
        //     } else {
        //         System.out.println("a is lesser");
        //     }
        // }
        //
        // if (a == b) {
        //     System.out.println("Equal");
        // } else if (a > b) {
        //     System.out.println("a is greater");
        // } else {
        //     System.out.println("a is lesser");
        // }

        // Question: 4
        // int button = sc.nextInt();
        //
        // if (button == 1) {
        //     System.out.println("Hello");
        // } else if (button == 2){
        //     System.out.println("Namaste");
        // } else if (button == 3){
        //     System.out.println("Bonjour");
        // } else {
        //     System.out.println("Invalid Button");
        // }
        //
        // switch (button) {
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //
        //     case 2:
        //         System.out.println("Namaste");
        //         break;
        //
        //     case 3:
        //         System.out.println("Bonjour");
        //         break;
        //
        //     default:
        //         System.out.println("Invalid Button");
        // }

        // System.out.print("Enter values for a and b: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        //
        // System.out.print(
        //     "\n1 : + (Addition) a + b\n" +
        //     "2 : - (Subtraction) a - b\n" +
        //     "3 : * (Multiplication) a * b\n" +
        //     "4 : / (Division) a / b\n" +
        //     "5 : % (Modulo or remainder) a % b\n"+
        //     "\nselect operation: "
        // );
        //
        // int n = sc.nextInt();
        //
        // switch (n) {
        //     case 1:
        //         System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
        //         break;
        //
        //     case 2:
        //         System.out.println("Difference between "+a+" and "+b+" is: "+(a-b));
        //         break;
        //
        //     case 3:
        //         System.out.println("Multiplication of "+a+" with "+b+" is: "+(a*b));
        //         break;
        //
        //     case 4:
        //         System.out.println(a+" divided by "+b+" is: "+(a/b));
        //         break;
        //
        //     case 5:
        //         System.out.println("Remainder of "+a+" divided by "+b+" is: "+(a%b));
        //         break;
        //
        //     default:
        //         System.out.println("Selected option is incorrect.");
        // }

        System.out.print("Enter the number of the month: ");
        int n = sc.nextInt();

        switch(n) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default :
                System.out.println("Invalid input");
        }

    }
}
