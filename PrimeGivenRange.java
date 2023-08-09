package com.Apnikaksha;

import java.util.*;

public class PrimeGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lr, ur;
        System.out.print("Enter lower range:");
        lr = sc.nextInt();
        System.out.print("Enter upper range: ");
        ur = sc.nextInt();

        for (int i = lr; i <= ur; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }
}
