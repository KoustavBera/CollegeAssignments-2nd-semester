package H3Q4.java;
/*
Write a recursive method in
Java to find the product of 2 numbers.
 */
public class H3Q4main {
    public static int product(int m,int n){
        if(n==1) return m;
        return product(m,n-1)+m;
    }

    public static void main(String[] args) {
        System.out.println(product(4,3));
    }
}
