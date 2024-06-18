import java.util.Scanner;

public class Binary {
    public static int binaryfrom(int n){
        if(n==1)
            return 1;
        return binaryfrom(n/2)*10+n%2;
    }

    public static void main(String[] args) {
        System.out.println(binaryfrom(12));
    }
}
