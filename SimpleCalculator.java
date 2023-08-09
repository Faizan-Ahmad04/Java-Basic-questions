// Simple calculator using switch statement
package com.Apnikaksha;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try {
            try (Scanner sc = new Scanner(System.in)) {
                int choice;
                float a, b, c;
                System.out.println("Enter first number: ");
                a = sc.nextFloat();
                System.out.println("Enter second number: ");
                b = sc.nextFloat();
                System.out.println("Enter choice: \n 1: Addition \n 2: Substrsction \n 3: multiplication \n 4: Divid ");
                choice = sc.nextInt();

                // choice is pass in switch statement
                // if the vale of choice is 1 case 1: will execute.
                // if the choice vale of choice is 2: case 2: will execute.
                // if the vale of choice is 3 case 3: will execute.
                // if the vale of choice is 4 case 4: will execute.

                // OTHERWISE
                // default: will execute.

                switch (choice) {
                    case 1:
                        c = a + b;

                        System.out.println(c);
                        break;

                    case 2:
                        c = a - b;
                        System.out.println(c);
                        break;

                    case 3:
                        c = a * b;
                        System.out.println(c);
                        break;

                    case 4:
                        c = a / b;
                        System.out.println(c);
                        break;

                    default:
                        System.out.println("Please Enter choice between 1 to 4");

                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
