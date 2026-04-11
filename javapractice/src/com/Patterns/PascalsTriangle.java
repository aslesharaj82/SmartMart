package com.Patterns;



public class PascalsTriangle {

    public static void main(String[] args) {

        int n = 6;

        for (int i = 0; i < n; i++) {

            int value = 1;

            // Print spaces for triangle shape
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}


