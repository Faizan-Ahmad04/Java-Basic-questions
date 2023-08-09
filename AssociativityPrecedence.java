package com.Apnikaksha;

public class AssociativityPrecedence {
    public static void main(String[] args) {
        int a = 2, b = 2, c = 2;
        int result = b * b - (4 * a * c) / (2 * a);
        System.out.println(result);

        // PROBLEM NO 2;
        float res = 7 / 4 * 9 / 2; // it give rong ans
        System.out.println("rong ans" + res);

        // so ve use....
        float R = 7 / 4.0f * 9 / 2.0f;
        System.out.println("Right ans is = " + R);

        // PROBLEM 3
        int v = 4, u = 2;
        a = 1;
        b = 1;
        float f = (v * v - u * u) / (2 * a * b);
        System.out.println(f);

        // PROBLEM 4
        int p = 7 * 49 / 7 + 35 / 7;
        System.out.println(p);

    }

}
