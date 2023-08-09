package com.Apnikaksha;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 6;

        // unary INCREMENT operator
        System.out.println(++x); // first increment value them use (pre-increment )
        System.out.println(x++); // first use value then increment (post-increment )

        // unary DECREMENT operator

        System.out.println(--x); // first decrement value them use (pre-decrement )
        System.out.println(x--); // first decrement value them use (pre-decrement )

        // PROBLEM
        int y = 7;
        int z = ++y * 8;
        System.out.println(z);

        
    }
}
