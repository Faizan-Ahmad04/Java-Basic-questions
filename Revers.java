
package com.Apnikaksha;

import java.util.*;

public class Revers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {

            // Without using formula!

            // int n = num % 10;
            // System.out.print(n);
            // num = num / 10;

            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println(rev);
        sc.close();
    }

}
