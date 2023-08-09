package com.Apnikaksha;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int n = num;
        int num1 = num;
        // int arm;

        int digitCount = 0, rem;
        double sum = 0;

        while (num > 0) {
            digitCount++;
            num = num / 10;

        }
        while (num1 > 0) {
            rem = num1 % 10;
            sum = (int) (sum + (Math.pow(rem, digitCount)));
            // int arm = (int) sum;
            num1 = num1 / 10;
        }
        if (n == sum) {
            System.out.println("Armstrong");

        } else {
            System.out.println("Not-Armstrong");
        }
        sc.close();
    }
}
