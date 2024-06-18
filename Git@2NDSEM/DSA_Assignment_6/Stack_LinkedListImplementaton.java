import java.util.Scanner;
class Node{
    Node next;
    int data;
}
public class Stack_LinkedListImplementaton {
    static Scanner sc=new Scanner(System.in);
    static Node top=null;
    public static boolean isEmpty(){
        return top == null;
    }
    public static void push(int item){

        Node temp=new Node();
        temp.data=item;
        temp.next=null;
        if(top==null) top=temp;
        else{
            temp.next=top;
            top=temp;
        }
    }
    public static void traverse(){

        if(isEmpty()) System.out.println("stack is empty");
        else{
            Node p=top;
            while(p!= null){
                System.out.println("|"+p.data+"|");
                System.out.println("---");
                p=p.next;
            }
        }
    }
    public static void pop(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return;
        }
        else if(top.next==null){
            top=null;
        }
        else{
            Node p=top;
            top=top.next;
            p.next=null;
        }
        System.out.println("stack updated!");
        traverse();
    }
    public static void peek(){
        if(isEmpty()) System.out.println("stack empty");
        else
            System.out.println("top : "+top.data);
    }
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Display");
            System.out.println("3:pop");
            System.out.println("4:peek");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("\t\t*** push ***\t\t");
                    int ch;
                    do {
                        System.out.println("Enter the item");
                        int i = sc.nextInt();
                        push(i);
                        System.out.println("any num: continue  0:exit" );
                        ch=sc.nextInt();
                    }while(ch!=0);
                    break;
                case 2:
                    System.out.println("\n\t\t *** stack: ***\t\t\n");
                    traverse();
                    break;
                case 3:
                    System.out.println("\t\t*** pop ***\t\t");
                    pop();
                    break;
                case 4:
                    peek();
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
