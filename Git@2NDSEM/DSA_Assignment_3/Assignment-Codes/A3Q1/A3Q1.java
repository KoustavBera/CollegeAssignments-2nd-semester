package A3Q1.java;

import java.util.Scanner;

//Write a Java program to read your lucky number from keyboard. Treat –ve no. as
//NumberFormatException. Write appropriate Exceptional handler.
class NumberFormatException extends Exception{
    NumberFormatException(String s){
        super(s);
    }
}
public class A3Q1 {
    public static void main(String[] args) throws NumberFormatException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your lucky number");
        int num=sc.nextInt();
        try{
            if(num<0)   throw new NumberFormatException("Invalid Input");
            System.out.println("Your Lucky Number is:" + num);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
