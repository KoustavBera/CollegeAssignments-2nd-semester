import java.util.Scanner;

public class Student {
    static Scanner sc=new Scanner(System.in);
    String name;
    double marks;
    void input(){
        System.out.println("Enter the name and marks of the student");
        name=sc.nextLine();
        marks=sc.nextDouble();
    }
    void display() throws MarksOutOfBoundsException {
        System.out.println("Name : " + name);
        try {
            if (marks < 0 || marks > 100) {
                throw new MarksOutOfBoundsException("Invalid Marks");
            }
            System.out.println("Marks : " + marks);
        }
        catch (MarksOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws MarksOutOfBoundsException{
        Student s=new Student();
        s.input();
        s.display();
    }
}
class MarksOutOfBoundsException extends Exception{
    MarksOutOfBoundsException(String s){
        super(s);
    }
}
