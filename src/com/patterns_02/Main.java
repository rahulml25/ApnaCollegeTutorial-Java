package com.patterns_02;

public class Main {
    public static void main(String[] args) {
        // // Pattern: 10 (butterfly)
        // int n = 4;
        //
        // // first part
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j < (n-i)*2; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //
        // // second part
        // for (int i = n; i > 0; i--) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 0; j < (n-i)*2; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //
        // // // first part
        // // for (int i = 0; i < n; i++) {
        // //     for (int j = 0; j < i+1; j++) {
        // //         System.out.print("*");
        // //     }
        // //     for (int j = 0; j < (n-(i+1))*2; j++) {
        // //         System.out.print(" ");
        // //     }
        // //     for (int j = 0; j < i+1; j++) {
        // //         System.out.print("*");
        // //     }
        // //     System.out.println();
        // // }
        // //
        // // // second part
        // // for (int i = 0; i < n; i++) {
        // //     for (int j = 0; j < n-i; j++) {
        // //         System.out.print("*");
        // //     }
        // //     // (n - (n-i)) *2
        // //     // = i * 2
        // //     for (int j = 0; j < /*(*/ i*2 /*)*/; j++) {
        // //         System.out.print(" ");
        // //     }
        // //     for (int j = 0; j < n-i; j++) {
        // //         System.out.print("*");
        // //     }
        // //     System.out.println();
        // // }

        // // Pattern: 11 (solid rhombus)
        // int n = 5;
        //
        // for (int i = 0; i < n; i++) {
        //     // spaces
        //     for (int j = 0; j < n-(i+1); j++) {
        //         System.out.print(" ");
        //     }
        //
        //     // stars
        //     for (int j = 0; j < n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Pattern: 12
        // int n = 5;
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

        // // Pattern: 13
        // int n = 5;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < (n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j > 0; j--) {
        //         System.out.print(j);
        //     }
        //     for (int j = 2; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // // Pattern: 14 (diamond)
        // int n = 4;
        //
        // // upper half
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < (n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < (i*2)-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //
        // // lower half
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 0; j < (n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < (i*2)-1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //=// Homeworks

        // // HQ: 1 (Hollow Butterfly)
        // int n = 5;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         if (j == 0 || j == (i-1)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     for (int j = 0; j < (n-i) * 2; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j >= 0; j--) {
        //         if (j == 0 || j == (i-1)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        //
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 0; j < i; j++) {
        //         if (j == 0 || j == (i-1)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     for (int j = 0; j < (n-i) * 2; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j >= 0; j--) {
        //         if (j == 0 || j == (i-1)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // // HQ: 2 (Hollow Rhombus)
        // int n = 5;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < n; j++) {
        //         if (i == 1 || i == n || j == 0 || j == n-1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // // HQ: 3 (Pascal’s Triangle)
        // int n = 5;
        //
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n-i-1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(binomialCoefficient(i, j) + " ");
        //     }
        //     System.out.println();
        // }

        // // HQ: 4 (Half Pyramid)
        // int n = 5;
        //
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 0; j < n-i; j++) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // // HQ: 5 (Inverted Half Pyramid)
        // int n = 4;
        //
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j < n-i; j++) {
        //         System.out.print(i+1);
        //     }
        //     System.out.println();
        // }
    }

    static int binomialCoefficient(int line, int i) {
        return factorial(line) / (factorial(line-i) * factorial(i));
    }

    static int factorial(int n) {
        int res = 1;

        for (int i = 2; i <= n; i++) {
            res *= i;
        }

        return res;
    }

}
