package A3Q4.java;
/*
Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box.

 */
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box{" + "content=" + content + '}';
    }
}

public class A3Q4main {
    public static void main(String[] args) {
        // Create a boxed String object
        Box<String> stringBox = new Box<>("Hello");
        Box<String> anotherStringBox = stringBox;
        System.out.println("Original stringBox: " + stringBox);
        System.out.println("Original anotherStringBox: " + anotherStringBox);

        // Change the contents of one and determine the effect on the other
        anotherStringBox.setContent("World");
        System.out.println("Modified stringBox: " + stringBox);
        System.out.println("Modified anotherStringBox: " + anotherStringBox);

        // Create a boxed Integer object
        Box<Integer> integerBox = new Box<>(1);
        Box<Integer> anotherIntegerBox = integerBox;
        System.out.println("Original integerBox: " + integerBox);
        System.out.println("Original anotherIntegerBox: " + anotherIntegerBox);

        // Change the contents of one and determine the effect on the other
        anotherIntegerBox.setContent(2);
        System.out.println("Modified integerBox: " + integerBox);
        System.out.println("Modified anotherIntegerBox: " + anotherIntegerBox);

        // Create a boxed Object object
        Box<Object> objectBox = new Box<>(new Object());
        Box<Object> anotherObjectBox = objectBox;
        System.out.println("Original objectBox: " + objectBox);
        System.out.println("Original anotherObjectBox: " + anotherObjectBox);

        // Put a string in the box
        anotherObjectBox.setContent("A string");
        System.out.println("Modified objectBox with string: " + objectBox);
        System.out.println("Modified anotherObjectBox with string: " + anotherObjectBox);

        // Put an integer in the box
        anotherObjectBox.setContent(123);
        System.out.println("Modified objectBox with integer: " + objectBox);
        System.out.println("Modified anotherObjectBox with integer: " + anotherObjectBox);
    }
}
