package A3Q2.java;
/*
Assign your favorite colors in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java.
 */
public class A3Q2main {
    public static void main(String[] args) {
        String[] color = {"red", "blue", "green", "purple", "magenta"};
         //ArrayIndexOutOfBoundsException
        try{
            System.out.println(color[10]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
            color=null;
            System.out.println(color[10]);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

    }
}