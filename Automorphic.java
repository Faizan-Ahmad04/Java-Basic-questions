package com.Apnikaksha;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // int tem = num;
        // int sqr = num * num;

        // int rem, count = 0;

        // while (num > 0) {
        // // rem = num % 10;
        // count++;
        // num = num / 10;
        // }

        // double result = sqr % (Math.pow(10, count));

        // int res = (int) result;
        // System.out.println(res);

        // if (tem == res) {
        // System.out.println("A");
        // } else {
        // System.out.println("N");
        // }

        int num, lastDigit, numCount = 0, checkCount = 0;

        System.out.println("Enter number: ");
        num = sc.nextInt();

        int sqr = num * num;

        while (num > 0) {

            lastDigit = num % 10;
            numCount++;

            if (lastDigit == sqr % 10) {
                checkCount++;
            }

            num = num / 10;
            sqr = sqr / 10;
        }

        if (numCount == checkCount) {
            System.out.println("A");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}
