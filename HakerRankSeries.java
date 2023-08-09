package com.Apnikaksha;

import java.util.Scanner;

public class HakerRankSeries {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        // Scanner in = new Scanner(System.in);
        System.out.println("enter t:");
        int t = in.nextInt();
        int s;
        for (int i = 0; i < t; i++) {
            s = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            if (n >= 1 && n <= 15) /* && (a>=0 && a<=50) && (b>=0 && b<=50) */ {

                for (int j = 0; j < n; j++) {
                    s = 0;
                    double d = Math.pow(2, j);
                    int temp = (int) d;
                    int z = a + (temp * b);
                    s = s + z;
                    a = s;

                    System.out.print(s + " ");
                }
            }

        }
        in.close();

    }
}
