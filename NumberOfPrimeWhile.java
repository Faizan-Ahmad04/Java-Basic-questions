package com.Apnikaksha;

import java.util.*;

public class NumberOfPrimeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0, num, lr, ur, pc = 0;
        System.out.println("Enter lower range");
        lr = sc.nextInt();
        System.out.println("enter upper range");
        ur = sc.nextInt();
        num = lr;
        while (num <= ur) {
            count = 0;
            int i = 1;
            while (i <= num / 2) {
                if (num % i == 0) {
                    count++;

                    if (count >= 2) {
                        break;
                    }
                }
                i++;
            }
            if (count == 1) {
                pc++;
                System.out.println("Number of prime numberb is: " + pc);
            }
            num++;
        }
        System.out.println(pc);
        sc.close();

    }

}
