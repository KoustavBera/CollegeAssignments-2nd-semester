import java.util.*;
class Node
{
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}
public class DoublyLinkedList {
    static Scanner sc=new Scanner(System.in);
    static Node start=null;
    public static void displayDD(){
        Node p=start;
        if(p==null) System.out.println("Double linked list Empty exception");
        else{
            while(p!=null){
                System.out.println("Reg_No: "+p.regd_no+"\tMarks: "+p.mark);
                System.out.println("--------------------------------------");
                p=p.next;
            }
        }
    }
    public static int length(){
        int l=0;
        Node p=start;
        while(p!=null){
            p=p.next;
            l++;
        }
        return l;
    }
    public static void create(){
        Node temp;
        int ch=0;
        System.out.println("\t\tEnter Reg_No and Marks\t\t");
        do{
            temp=new Node();
            temp.prev=null;
            temp.next=null;
            temp.regd_no=sc.nextInt();
            temp.mark=sc.nextFloat();
            if(start==null){
                start=temp;
            }
            else {
                temp.next = start;
                start.prev = temp;
                start = temp;
            }
            System.out.println("1:continue 0:stop");
            ch=sc.nextInt();

            }while (ch!=0);
    }
public static void inst_at_beg(int r,float m){

    Node temp;
    temp=new Node();
    temp.regd_no=r;
    temp.mark=m;
    if(start==null){
        start=temp;
    }
    else{
    temp.next=start;
    start.prev=temp;
    start=temp;
    }
}
public static void inst_at_end(int r,float m) {

    Node p = start;
    Node temp = new Node();
    temp.regd_no = r;
    temp.mark = m;
    if (start == null) {
        start = temp;
    } else {
        while (p.next != null) {
            p = p.next;
        }
        p.next = temp;
        temp.prev = p;
        temp.next = null;
    }
}

public static void inst_at_any(int r,float m,int pos) {

    int i = 1;
    Node p = start;
    while (i < pos - 1) {
        p = p.next;
        i++;
    }
    Node temp = new Node();

    temp.regd_no = r;
    temp.mark = m;
    temp.next = null;
    temp.prev = null;

    if (pos >= length()+1 || pos < 0) {
        System.out.println("Invalid position");
    } else if (pos == 1) {
        inst_at_beg(r,m);
    } else {
        temp.next = p.next;
        /***** left *****/
        temp.prev = p;
        /***** right *****/


        //time to link temp by surrounding elements
        p.next.prev = temp;
        p.next = temp;


    }
}
    public static int delete_at_beg() {
        Node p=null,temp;
        p=start;
        if (start == null) {
            System.out.println("Linked List Empty!");
            return 0;
        } else {
            if(start.next!=null) {
                start = start.next;
                start.prev = null;
            }
            start=null;
        }
        return p.regd_no;
    }
    public static int delete_at_end() {
       Node p,temp;
       p=start;
       if(p==null){
           System.out.println("Double Linked List Empty !!");
           return 0;
       }
       else {
           while (p.next != null) {
               p = p.next;
           }
           temp=p;
           if(p.prev==null){
               start=null;
           }
           else{
               p.prev.next=null;
               p.prev=null;
           }
       }
       return temp.regd_no;
    }
    public static int delete_at_any(int pos){
        Node temp;
        int i=1;
        Node p=start;
        if (pos > length() || pos < 0) {
            System.out.println("Invalid position");
            return 0;
        } else if (pos == 1) {
            return delete_at_beg();
         }
            else{
                while (i < pos - 1) {
                    p = p.next;
                    i++;
                }
                temp=p.next;
                p.next=temp.next;
                if(temp.next!=null){
                    temp.next.prev=p;
                }
                temp.next=null;
                temp.prev=null;
            }
        return temp.regd_no;
    }
    public static boolean isThereDLL(int item){
        Node p=start;

        int flag=0;
       while (p!=null){
           if (p.regd_no == item) {
               flag = 1;
               break;
           }
           p=p.next;
       }
       if (flag==1) return true;
       return false;
    }
    public static void main(String[]args){
        while (true) {
            System.out.println("\t\t*********** MENU ************\t\t");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Begin");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any");
            System.out.println("6: Delete at Begin");
            System.out.println("7: Delete at End");
            System.out.println("8: Delete at Any");
            System.out.println("9: Search");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch (ch){
                case 0:
                    System.exit(0);
                case 1:
                    create();
                    break;
                case 2:
                    displayDD();
                    break;
                case 3:
                    System.out.println("\n\n********* Insert At Begining *********\n\n");
                    System.out.println("Enter reg No and marks");
                    int r=sc.nextInt();
                    float m=sc.nextFloat();
                    inst_at_beg(r,m);
                    System.out.println("update succesfull");
                    displayDD();
                    break;
                case 4:
                    System.out.println("\n\n********* Insert At End *********\n\n");
                    System.out.println("Enter reg No and marks");
                    int r2=sc.nextInt();
                    float m2=sc.nextFloat();
                    inst_at_end(r2,m2);
                    System.out.println("update succesfull");
                    displayDD();
                    break;
                case 5:
                    System.out.println("\n\n********* Insert At Any *********\n\n");
                    System.out.println("Enter reg No and marks");
                    int r3=sc.nextInt();
                    float m3=sc.nextFloat();
                    System.out.println("Enter the position where u want to insert");
                    int pos=sc.nextInt();
                    inst_at_any(r3,m3,pos);
                    System.out.println("update succesfull");
                    displayDD();
                    break;
                case 6:
                    System.out.println("\n\n********* Delete at Beg *********\n\n");
                    System.out.println("Deleted regdno: "+delete_at_beg());
                    System.out.println("update succesfull");
                    displayDD();
                    break;
                case 7:
                    System.out.println("\n\n********* Delete at End *********\n\n");
                    System.out.println("Deleted regdno: "+delete_at_end());
                    System.out.println("update succesfull");
                    displayDD();
                    break;
                case 8:
                    System.out.println("\n\n********* Delete at Any *********\n\n");
                    System.out.println("Enter the position which u wnna delete");
                    int pos2=sc.nextInt();
                    System.out.println("Deleted regdno: "+delete_at_any(pos2));
                    System.out.println("update succesfull");
                    displayDD();
                    break;
                case 9:
                    System.out.println("\n\n********* Search *********\n\n");
                    System.out.println("enter the regd_no u wanna find");
                    int item=sc.nextInt();
                    if(isThereDLL(item)){
                        System.out.println("Searched Element found!  "+item);
                    }
                    else {
                        System.out.println("Searched Element failed!");
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }

    }
}
