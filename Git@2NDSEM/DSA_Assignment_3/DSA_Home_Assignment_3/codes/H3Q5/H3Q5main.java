package H3Q5.java;
/*
Write a recursive Java method that takes
a character string s and outputs its reverse. For
example, the reverse of 'pots&pans' would be
'snap&stop'.

 */
public class H3Q5main {
    public static String SReverse(String s){
        int n=s.length();
        if(n==1){
            return s;
        }
        else {
            return s.charAt(n-1)+SReverse(s.substring(0,n-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(SReverse("pots&pans"));
    }
}
