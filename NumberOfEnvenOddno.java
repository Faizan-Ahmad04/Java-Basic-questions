package com.Apnikaksha;

import java.util.Scanner;

public class NumberOfEnvenOddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countE = 0, countO = 0, lr, ur;
        System.out.println("Enter starting number: ");
        lr = sc.nextInt();
        System.out.println("Enter end number: ");
        ur = sc.nextInt();
        int i = lr;
        while (i <= ur) {

            if (i == 0) {
                System.out.println("zero");
            } else if (i % 2 == 0)
                countE++;

            else
                countO++;
            i++;
        }
        System.out.println("Number of even number between given range is: " + countE);
        System.out.println("Number of odd number between given range is: " + countO);

        sc.close();

    }

}
