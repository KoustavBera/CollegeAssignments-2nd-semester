package H3Q1.java;
/*
Write a recursive method in Java to return the greatest common divisor(gcd) of two integers m
and n, given that in general, gcd(m,n)=gcd(n, m mod n).
 */
public class H3Q1main {
    public static int gcd(int m,int n){
        if(n==0){
            return m;
        }
        return gcd(n,m%n);
    }

    public static void main(String[] args) {
        System.out.println(gcd(8,4));
    }
}
