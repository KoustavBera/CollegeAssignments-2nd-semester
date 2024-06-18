package A3Q3.java;
/*
Create a class Student & enter mark, name of the student. If mark is more than 100, create
exception MarksOutOfBoundException & throw it using Java.
 */
class MarksOutOfBoundsException extends Exception{
    MarksOutOfBoundsException(String s){
        super(s);
    }
}
public class A3Q3main {
    public static void main(String[] args) throws MarksOutOfBoundsException {
        System.out.println("Enter the name and Marks of student");
        String name="Koistiv Bustov";
        double mark=-10.93;
        System.out.println("Name: "+name);
        try{
            if(mark<100) {
                throw new MarksOutOfBoundsException("Invalid Marks");
            }
            System.out.println("Marks: "+mark);
        }
        catch (MarksOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
