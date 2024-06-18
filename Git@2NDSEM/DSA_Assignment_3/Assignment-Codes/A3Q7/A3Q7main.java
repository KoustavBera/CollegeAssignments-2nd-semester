package A3Q7.java;

import java.util.Scanner;

/*
Write a recursive method in Java that computes the factorial of a given integer.
 */
public class A3Q7main {
    public static int fact(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        return fact(n-1)*n;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
