package com.Apnikaksha;

import java.util.*;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = -1, num2 = 1, num3;

        System.out.println("Enter how much series term you want: ");
        int term = sc.nextInt();

        // int num1 = 0, num2 = 1;
        // System.out.print("Fabionacci series is: " + num1 + " " + num2 + " ");

        System.out.print("Fabonacci series is: ");

        for (int i = 0; i < term; i++) {

            num3 = num1 + num2;
            System.out.print(num3 + " ");

            num1 = num2;
            num2 = num3;
        }
        sc.close();
    }

}
