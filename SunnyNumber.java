package com.Apnikaksha;

import java.util.*;

public class SunnyNumber {
    public static boolean isSunny(int n) {
        if (Math.sqrt(n + 1) % 1 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower range: ");
        int lr = sc.nextInt();
        System.out.println("Enter upper range: ");
        int ur = sc.nextInt();
        System.out.println("Sunny number from " + lr + " to " + ur + " are");
        for (int i = lr; i <= ur; i++) {
            if (isSunny(i))
                System.out.println(i + " ");
        }

        sc.close();
    }

}
