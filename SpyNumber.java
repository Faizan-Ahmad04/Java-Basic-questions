package com.Apnikaksha;

import java.util.*;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter anumber: ");
        int n = sc.nextInt();
        int sum = 0, product = 1;

        while (n > 0) {
            int lastdigt = n % 10;
            // sum = 0;
            sum = sum + lastdigt;
            // product = 1;
            product = product * lastdigt;
            n = n / 10;

        }
        if (sum == product) {
            System.out.println("Number is Spy");
        } else {
            System.out.println("Number is not Spy");
        }

        sc.close();

    }

}
