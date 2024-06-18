package H3Q6.java;
/*
Write a recursive Java method
 that determines if a string s is a palindrome, that is, it is
equal to its reverse.
Examples of palindromes include 'racecar' and
'gohangasalamiimalasagnahog'.
 */
public class H3Q6main {
    public static boolean SPalindrome(String s){
        int n=s.length();
       if(n==1){
           return true;
       }
       if(n==2){
           return s.charAt(0)==s.charAt(1);
       }
       if(s.charAt(0)==s.charAt(n-1)){
           return SPalindrome(s.substring(1,n-1));
       }
       else return false;
    }

    public static void main(String[] args) {
        System.out.println(SPalindrome("YMMOMMOMMY"));
    }
}
