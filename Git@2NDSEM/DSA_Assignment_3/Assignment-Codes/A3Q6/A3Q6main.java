package A3Q6.java;
/*
Write a java method using Generics to count the occurrence of an element in an array of
any type. The signature of count method is given below.
public static <T> int count(T[] array, T item)
 */
public class A3Q6main {
    public static <T> int count(T[] array, T item){
    int c=0;
        for(T element:array){
    if(element.equals(item))
        c++;
}
        return c;
    }

    public static void main(String[] args) {
        Integer[] intArr={1,2,3,4,4,5,6,7,4};
        Character[] chArr={'a','b','c','c','c'};
        System.out.println("Occurence of 4 in integer array: "+count(intArr,4));
        System.out.println("Occurence of c in character array: "+count(chArr,'c'));
    }
}
