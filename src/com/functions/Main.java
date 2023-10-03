package com.functions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        //
        // printMyName(name);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calculateSum(a, b);
        // System.out.println("Sum of two numbers is: "+sum);

        // int sum = calculateProduct(a, b);
        // System.out.println("Product of two numbers is: "+sum);

        // int n = sc.nextInt();
        //
        // int factorial = calculateFactorial(n);
        // System.out.println("Factorial of "+n+" numbers is: "+factorial);

        //-// (Homework Problems)
        // int n = sc.nextInt();

        // // HQ: 1
        // System.out.println(
        //     "The number is "+
        //     (checkIsPrime(n) ? "" : "not ")+
        //     "prime."
        // );

        // // HQ: 2
        // System.out.println(
        //         "The number is "+
        //                 (checkIsEven(n) ? "" : "not ")+
        //                 "even."
        // );

        // // HQ: 3
        // printTable(n);

        // // HQ: 4
        // read about recursion: success 👍

        // // VideoExtraQ: 1
        // int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // printAvg(a,b,c);

        // // VideoExtraQ: 2
        // int n = sc.nextInt();
        // printSumOfOdds(n);

        // // VideoExtraQ: 3
        // int n = sc.nextInt();
        // printSumOfOdds(n);

        // // VideoExtraQ: 4
        // int radius = sc.nextInt();
        //
        // double circumference = calculateRadius(radius);
        // System.out.println("The circumference of the circle is: "+circumference);

        // // VideoExtraQ: 5
        // int age = sc.nextInt();
        // checkIfEligibleToVote(age);

        // // VideoExtraQ: 6
        // do {} while (true);

        // // VideoExtraQ: 7
        // int positives = 0, zeros = 0, negative = 0;
        // String choice;
        //
        // do {
        //     System.out.print("want to enter numbers? (Y/n): ");
        //     choice = sc.next();
        //     if(!choice.equalsIgnoreCase("n")) break;
        //
        //     System.out.print("number: ");
        //     int num = sc.nextInt();
        //
        //     if (num == 0) {
        //         zeros++;
        //     } else if (num > 1) {
        //         positives++;
        //     } else {
        //         negative++;
        //     }
        // } while (!choice.equalsIgnoreCase("n"));
        //
        // System.out.println("Positives: "+positives);
        // System.out.println("Zeros: "+zeros );
        // System.out.println("Negative: "+negative);

        // // VideoExtraQ: 8
        // System.out.print("Enter the number: ");
        // int x = sc.nextInt();
        // System.out.print("Enter the power: ");
        // int n = sc.nextInt();
        //
        // int value = x;
        //
        // for (int i = 1; i < n; i++) {
        //     value *= x;
        // }
        //
        // System.out.println(x+"^"+n+": "+value);

        // // VideoExtraQ: 9
        // int a = sc.nextInt(),
        //     b = sc.nextInt();
        //
        // int gcd = greatestCommonDivisor(a, b);
        // System.out.println(gcd);

        // // VideoExtraQ: 10
        // int n = sc.nextInt();
        //
        // int last = 0,
        //     present = 1;
        //
        // for (int i = 0; i < n; i++) {
        //     System.out.print(last+" ");
        //
        //     int temp = last;
        //     last = present;
        //     present = temp + present;
        // }
        //
        // System.out.println();
    }

    // public static int greatestCommonDivisor(int a, int b) {
    //     int[] divs1 = new int[50],
    //           divs2 = new int[50];
    //
    //     int divs1_count = 0;
    //     {
    //         for (int i = 1; i <= a; i++) {
    //             if (a % i == 0) {
    //                 divs1[divs1_count++] = i;
    //             }
    //         }
    //
    //         // for (int i = 0; i < divs1_count; i++) {
    //         //     System.out.println(divs1[i]);
    //         // }
    //     }
    //
    //     int divs2_count = 0;
    //     {
    //         for (int i = 1; i <= b; i++) {
    //             if (b % i == 0) {
    //                 divs2[divs2_count++] = i;
    //             }
    //         }
    //
    //         // for (int i = 0; i < divs2_count; i++) {
    //         //     System.out.println(divs2[i]);
    //         // }
    //     }
    //
    //     int maxCommonDivisor = 1;
    //
    //     for (int i = 0; i < divs1_count; i++) {
    //         int elem_1 = divs1[i];
    //         for (int j = 0; j < divs2_count; j++) {
    //             if (elem_1 == divs2[j] && maxCommonDivisor < elem_1) {
    //                 maxCommonDivisor = elem_1;
    //                 break;
    //             }
    //         }
    //     }
    //
    //     return maxCommonDivisor;
    // }

    // public static void checkIfEligibleToVote(int age) {
    //     if (age >= 18) {
    //         System.out.println("Welcome! you are eligible to vote.");
    //     } else {
    //         System.out.println("Ohh! you aren't eligible to vote.");
    //     }
    // }

    // public static double calculateRadius(int r) {
    //     return 2*3.4*r;
    // }

    // public static void printSumOfOdds(int num) {
    //     int oddSum = 0;
    //     for (int i = 1; i <= num; i+=2) {
    //         oddSum += i;
    //     }
    //     System.out.println("The sum of all odd numbers from 1 to "+num+" is: "+oddSum);
    // }

    // public static void printAvg(int a, int b, int c) {
    //     float avg = ((float)(a+b+c))/3;
    //     System.out.println("The average of three numbers is: "+avg);
    // }

    // public static void printTable(int num) {
    //     for (int i = 1; i <= 10; i++) {
    //         System.out.println(num+" x "+i+" = "+(num*i));
    //     }
    // }

    // public static boolean checkIsEven (int num) {
    //     return num%2 == 0;
    // }

    // public static boolean checkIsPrime(int num) {
    //     for (int i = 2; i < num; i++) {
    //         if (num%i == 0) return false;
    //     }
    //     return true;
    // }

    // public static int calculateFactorial(int n) {
    //     int fact = 1;
    //     for (int i = 2; i <= n; i++) {
    //         fact *= i;
    //     }
    //     return fact;
    // }

    // public static int calculateProduct(int a, int b) {
    //     return a*b;
    // }

    // public static int calculateProduct(int a, int b) {
    //     return a*b;
    // }

    // public static int calculateSum(int a, int b) {
    //     return a+b;
    // }

    // public static void printMyName(String name) {
    //     System.out.println("I am "+name+".");
    // }
}
