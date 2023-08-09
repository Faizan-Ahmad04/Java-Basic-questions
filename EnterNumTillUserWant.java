package com.Apnikaksha;

import java.util.Scanner;

public class EnterNumTillUserWant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0, zero = 0;

        System.out.println("press 1 to Continue &  0 to stop");
        int input = sc.nextInt();

        while (input == 1) {

            System.out.println("Enter you number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positive++;
            }

            else if (number <= 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.println("press 1 to Continue & 0 to Stop");
            input = sc.nextInt();
        }

        System.out.println("Negatives: " + negative);
        System.out.println("Positives: " + negative);
        System.out.println("Zeros: " + negative);
        sc.close();
    }
}
