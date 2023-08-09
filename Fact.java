package com.Apnikaksha;

import java.util.*;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, fact = 1;
        System.out.println("Please enter a number num: ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("invalid");
        } else {

            // int i = 1;
            while (num > 0) {
                fact = fact * num;
                num--;
            }
        }
        System.out.println("Factroial of number is: \n" + fact);
        sc.close();
    }

}
