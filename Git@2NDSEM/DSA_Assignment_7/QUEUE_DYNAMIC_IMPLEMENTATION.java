import java.util.Scanner;

class Node{
    Node next;
    int data;
}
public class QUEUE_DYNAMIC_IMPLEMENTATION {
static Scanner sc=new Scanner(System.in);
static Node front=null;
static Node rear=null;
public static boolean isEmpty(){
    return rear == null;
}
public static void insert(int item){
    Node temp=new Node();
    temp.data=item;
    temp.next=null;
    if(rear==null){
        rear=temp;
        front=temp;
    }
    else {
        rear.next=temp;
        rear=temp;
    }
}
public static void traverse(){
    Node p;
    if(isEmpty()){
        System.out.println("Queue is empty");
    }
    else {
        p=front;
        while(p!=null){
            System.out.print("|"+p.data+"|");
            p=p.next;
        }
    }
}
public static void delete(){
    Node temp;
    if(isEmpty()){
        System.out.println("Queue is empty");
        return;
    }
    temp=front;
    if(front.next==null){
        front=null;
        rear=null;
    }
    else {
        front = front.next;
    }
    System.out.println("Deleted item="+temp.data);
}


        public static void main(String[] args) {
            while(true)
            {

                System.out.println("\n\n***MENU***\n\n");
                System.out.println("0: Exit");
                System.out.println("1: Insert");
                System.out.println("2: Delete");
                System.out.println("3: Display");
                System.out.println("Enter your choice");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 0:
                        System.exit(0);
                    case 1:
                        System.out.println("\t\t***** QInsertion *****\t\t");
                        int ch;
                        do {
                            System.out.println("Enter item");
                            int item=sc.nextInt();
                            insert(item);
                            System.out.println("Press Any Button to continue   0:exit");
                            ch=sc.nextInt();
                        }while(ch!=0);
                        break;
                    case 2:
                        System.out.println("\t\t***** QDeletion *****\t\t");
                        delete();
                        if(!isEmpty()) {
                            System.out.println("Q updated!");
                            traverse();
                        }
                        break;
                    case 3:
                        System.out.println("\t\t***** Queue *****\t\t");
                        traverse();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
}
