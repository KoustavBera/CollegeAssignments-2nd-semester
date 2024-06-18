package A3Q8.java;
/*
Write a recursive method in Java which, given real value x and a positive integer n, returns
the value of x^n
 */
public class A3Q8main {
    public static int power(int x,int n){
        if(n>=0){
            if (n==0) return 1;
            int smallAns=power(x,n/2);
            if(n%2==0) return smallAns*smallAns;
            else return smallAns*smallAns*x;
        }
        else {
            System.out.println("n cannot be negative integer");
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
