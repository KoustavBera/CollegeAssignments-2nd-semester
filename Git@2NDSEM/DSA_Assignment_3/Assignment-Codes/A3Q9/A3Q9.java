package A3Q9main.java;

/*
Write a recursive method in Java which, given an integer n, print it with its digits reversed.
For example , given 4735, it prints 5374
 */
public class A3Q9 {
    public static void reverse(int n){
        if(n>=0 && n<=9) {
            System.out.println(n);
            return;
        }
        System.out.print(n%10);
        reverse(n/10);
    }

    public static void main(String[] args) {
        reverse(4735);
    }
}
