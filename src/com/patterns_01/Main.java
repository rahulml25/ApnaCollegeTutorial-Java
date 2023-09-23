package com.patterns_01;

public class Main {
    public static void main(String[] args) {
        // // Pattern: 1
        // int rows = 4, cols = 5;
        //
        // for (int i = 1; i <= rows; i++) {
        //     for (int j = 1; j <= cols; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Pattern: 2
        // int rows = 4, cols = 5;
        //
        // // outer loop
        // for (int i = 1; i <= rows; i++) {
        //     // inner loop
        //     for (int j = 1; j <= cols; j++) {
        //         // cell -> (i,j);
        //         // if (i == 1 || i == rows) {
        //         //     System.out.print("*");
        //         // } else {
        //         //     if (j == 1 || j == cols) {
        //         //         System.out.print("*");
        //         //     } else {
        //         //         System.out.print(" ");;
        //         //     }
        //         // }
        //         if (
        //             (i == 1 || i == rows)
        //          || (j == 1 || j == cols)
        //         ) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");;
        //         }
        //     }
        //     System.out.println();
        // }

        // // Pattern: 3
        // int n = 4;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Pattern: 4
        // int n = 4;
        //
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Pattern: 5
        // int n = 4;
        //
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop -> space print
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //
        //     // inner loop -> star print
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //
        //     System.out.println();
        // }

        // // Pattern: 6
        // int n = 5;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // // Pattern: 7
        // int n = 5;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= (n-i+1); j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // // Pattern: 8 (Floyd's Triangle)
        // int n = 5;
        // int number = 1;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // // Pattern: 9
        // int n = 5;
        //
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        //     // inner loop
        //     for (int j = 1; j <= i; j++) {
        //         // System.out.print((i+j+1)%2 + " "); // short form
        //         int sum = i+j;
        //         if (sum%2 == 0) {
        //             System.out.print("1 ");
        //         } else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }

        //=// Homeworks

        // // HQ: 1
        // int n = 5;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // HQ: 2
        // int n = 9;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // HQ: 3
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
