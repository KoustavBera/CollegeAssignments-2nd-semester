package A3Q10.java;
/*
The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
each is the sum of the preceding two. Write a recursive method in Java which, given n,
returns the n
th Fibonacci number.
 */
public class A3Q10main {
    public static int fib(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(4+"th="+fib(4));
    }
}
