import java.util.Scanner;

public class QUEUE_ARRAY_IMMPLEMENTATION {
    static Scanner sc=new Scanner(System.in);
    static int front=-1,rear=-1;
    static  final int max=5;
    public static boolean isEmpty(){
        return rear == -1;
    }
    public static boolean isFull(){
        return rear == max-1;
    }
    public static void insert(int[] sq,int item){
        if(isFull()){
            System.out.println("Queue overflow");
            return;
        }
        else if(rear== -1){
            front=0;
            rear=0;
        }
        else{
            rear++;
        }
        sq[rear]=item;
    }
    public static void traverse(int[]sq){
        if(isEmpty()){
            System.out.println("Q is empty!!");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print("|"+sq[i]+"|");
            }
            System.out.println();
        }
    }
    public static void delete(int[]sq){
        int item;
        if(isEmpty()){
            System.out.println("Q empty");
        }
        else {
            //store the deleted front {FIFO}
            item = sq[front];
            //if front == rear = 0 that means only one element was present so after delete front queue becomes empty

            if (front == rear) {
            front=-1;
            rear=-1;
            }
            //if front!= rear=> there is second element then front becomes the second element
            front++;
            System.out.println("deleted item:"+item);
            }
 }

    public static void main(String[] args) {
        int max=5;
        int[] sq=new int[max];

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
                        insert(sq,item);
                        System.out.println("Press Any Button to continue   0:exit");
                        ch=sc.nextInt();
                    }while(ch!=0);
                    break;
                case 2:
                    System.out.println("\t\t***** QDeletion *****\t\t");
                    delete(sq);
                    if(!isEmpty()) {
                        System.out.println("Q updated!");
                        traverse(sq);
                    }
                    break;
                case 3:
                    System.out.println("\t\t***** Queue *****\t\t");
                    traverse(sq);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
