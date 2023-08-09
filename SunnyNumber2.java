package com.Apnikaksha;

import java.util.*;

public class SunnyNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int temp = num + 1;

        if (Math.sqrt(temp) % 1 == 0) {
            System.out.println("Number is sunny number: ");
        } else {
            System.out.println("Number is not sunny number: ");
        }

    }

}
