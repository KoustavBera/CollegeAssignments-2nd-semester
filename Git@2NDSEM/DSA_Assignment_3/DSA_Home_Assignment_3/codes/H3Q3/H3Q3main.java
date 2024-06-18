package H3Q3.java;
/*
Write a recursive method in Java to
find the binary equivalent of a positive decimal integer.
 */
public class H3Q3main {
    public static int binary(int n){
        if(n>=0){
            if(n==1) return 1;
            return binary(n/2)*10+n%2;
        }
        System.out.println("Negative number is not allowed");
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binary(3));
    }
}
