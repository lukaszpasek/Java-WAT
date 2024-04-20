package FactorialCheck;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class Factorial {

    public static void main(String[] args){
        System.out.println("Test: " + factorial(5));
    }

    public static int factorial(int n){
        if(n < 0){
            throw new IllegalArgumentException(n + " < 0");
        }

        if(n < 2){
            return 1;
        }

        return n*factorial(n-1);
    }

}
