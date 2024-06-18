package A3Q5.java;
/*
Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below.
public static < E > void printArray( E[] inputArray)
 */

public class A3Q5main{
   public static <E> void printArray(E[] arr){
       for(E element:arr){
           System.out.print(element+" ");
       }
   }

    public static void main(String[] args) {
        Integer[] intArr={1,2,3,4};
        Double[] doubArr={1.2,2.2,3.2};
        String[] strArr={"car","cat"};
        System.out.println("integer");
        printArray(intArr);
        System.out.println("\ndouble");
        printArray(doubArr);
        System.out.println("\nstring");
        printArray(strArr);
    }
}
