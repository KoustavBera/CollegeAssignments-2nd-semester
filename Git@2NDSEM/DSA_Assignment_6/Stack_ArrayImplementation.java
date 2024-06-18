import java.util.Scanner;

public class Stack_ArrayImplementation {
    public static final int MAX=5;
    static int top=-1;
    public static void push(int[]s,int item){
        if(top==MAX-1){
            System.out.println("Stack Overflow");
            return;
        }
        if(top==MAX-2){
            System.out.println("Alert: Max elements reached");
        }
        top++;
        s[top]=item;
    }
    public static void pop(int[]s){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        if(top==0){
            System.out.println("Alert ! this is the last element");
        }
        int item=s[top];
        top--;
        System.out.println("Popped item : "+item);
    }
    public static void peek(int []s){
        System.out.println("Peek : "+s[top]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] stack=new int[MAX];

        while(true)
        {
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("\t\t******* Push *******\t\t");
                    System.out.println("Enter Item");
                    int item=sc.nextInt();
                    push(stack,item);
                    break;
                case 2:
                    System.out.println("\t\t******* Pop *******\t\t");
                    pop(stack);
                    break;
                case 3:
                    System.out.println("\t\t******* Display *******\t\t");
                    System.out.println("Stack:\n");
                    for(int i=top;i> -1;i--){
                        System.out.println("|"+stack[i]+"|");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
