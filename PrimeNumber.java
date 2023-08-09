package com.Apnikaksha;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // USING WHILE LOOP!

        int num;
        System.out.println("Enter number : ");
        num = sc.nextInt();
        int i = 2;
        boolean isPrime = true;

        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println("Number is  prime ");
        } else {
            System.out.println("Number is not prime ");
        }

        // USING FOR LOOP!

        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // int count = 0;
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // System.out.println("Number is Prime ");
        // } else {
        // System.out.println("Number is not prime ");
        // }

        sc.close();
    }
}
