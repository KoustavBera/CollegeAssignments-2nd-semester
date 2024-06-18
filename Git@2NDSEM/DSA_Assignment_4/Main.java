import java.util.Scanner;

class Node{
    protected int regd_no;
    protected float mark;
    protected Node next;
    Node(int r,float m){
        regd_no=r;
        mark=m;
    }
}
class ques1{
    static Node start=null;
    static Scanner sc=new Scanner(System.in);
    public static void create(){
        Node temp;
        int ch;

        do{
            System.out.println("enter 1) regd_no and 2) marks");
            int reno=sc.nextInt();
            float marks=sc.nextFloat();
            temp=new Node(reno,marks);
            temp.next=start;
            start=temp;
            System.out.println("Enter 1 to continue and 0 to stop");
            ch=sc.nextInt();
        }while(ch!=0);
    }
    public static void display(){
        Node p=start;
        while(p!=null){
            System.out.println("RegNo.:"+p.regd_no+" |  Marks Obtained:"+p.mark);
            p=p.next;
        }
    }
    /*
    Insertion
     */
    public static void inst_at_beg(int r, float m){
        Node temp=new Node(r,m);
        temp.next=null;
        if(start==null) start=temp;
        else{ temp.next=start;  start=temp; }
    }
    public static int length(){
        int l=0;
        Node p=start;
        while(p!=null){
            l++;
            p=p.next;
        }
        return l;
    }
    public void inst_at_end(int r, float m){
        Node temp=new Node(r,m);
        temp.next=null;
        Node p=start;
//        int l=length();
        while(p.next!=null){
            p=p.next;
        }
        p.next=temp;
    }
    public void inst_at_any(int r, float m, int idx) {
        int l=length();
        if((idx<1)||(idx>l+1))  System.out.println("Given idx does not exists");

        else{
            if (idx == 1) inst_at_beg(r, m);
            else {
                Node temp = new Node(r, m);
                temp.next = null;
                Node p = start;
                int i=0;
                while (i<idx-1) {
                    p = p.next;
                    i++;
                }
                temp.next=p.next;
                p.next = temp;
            }
        }

    }
    /*
    Deletion
     */
    public static Node del_at_beg(){
        /*
        3->2->1
        2->1
         */
        Node p=start;
        start=p.next;
        p.next=null;
        return p;

    }
    public static Node del_at_end(){

        Node p;
        p=start;
        while(p.next.next!=null){
            p=p.next;
        }
        Node temp=p.next;
        p.next=null;
        return temp;
    }
    public static Node delt_at_any(int idx){
        int l=length();
        Node temp = null;
        if(idx>l+1 || idx<1) System.out.println("InvalidIndexInputException");
        else {
            if (idx == 1) del_at_beg();
            else {
                Node p = start;
                int i = 1;
                while (i < idx - 1) {
                    p = p.next;
                    i++;
                }
                temp = p.next;
                p.next = temp.next;
                temp.next = null;
            }
        }
        return temp;

    }
    /*
    Searching
     */
    public static void searchRegNo(int reg){
        Node p=start;
        while(p!=null){
            if(p.regd_no==reg){
                System.out.println("\nsearch success!\nregno\t|\tmarks");
                System.out.println(p.regd_no+"\t\t\t"+p.mark);
                System.out.println("do you want to update the marks?Y:yes/N:No");
                char c=sc.next().charAt(0);
                if(c=='y'){
                    System.out.println("enter the marks");
                    float m=sc.nextFloat();
                    p.mark=m;
                    System.out.println("\nsearch success!\nregno\t|\tmarks");
                    System.out.println(p.regd_no+"\t\t\t"+p.mark);
                    System.out.println("marks update success...");
                }
                else{
                    System.out.println("\nsearch success!\nregno\t|\tmarks");
                    System.out.println(p.regd_no+"\t\t\t"+p.mark);
                }
                return;
            }
            p=p.next;
        }
        System.out.println("registered number not found");
    }
    /*
    Sorting
     */
    public static void sortList(){
        //
    }
    /*
    Count List
     */
    public static int countList(){
        Node p=start;
        int i=0;
        while(p!=null){
            i++;
            p=p.next;
        }
        return i;
    }
        /*
        Node reverse
         */
    public static void reverse(){

    }
public static void main(String[] args) {
    create();
    display();
//        System.out.println("enter the reg and marks");
//        int r=sc.nextInt();
//        float f=sc.nextFloat();
//        inst_at_end(r,f);
//        display();
//        System.out.println("enter where u wanna insert");
//        int v=sc.nextInt();
//        inst_at_any(r,f,v);
//        System.out.println("\t"+"Delete at beg"+"\t");
//        Node temp=del_at_beg();
//        System.out.println("\t \tList after delete at beg \t \t");
//        display();
//
//        System.out.println("deleted element:  regno      marks    \n"+"\t"+temp.regd_no+"      "+temp.mark);
//        System.out.println("\t"+"Delete at end"+"\t");
//        Node temp2=del_at_end();
//        System.out.println("\t \tList after delete at end \t \t");
//        display();
//        System.out.println("deleted element:  regno      marks    \n"+"\t"+temp2.regd_no+"      "+temp2.mark);

//        System.out.println("\t \tList after delete at an index \t \t");
//        int ch=sc.nextInt();
//        Node temp3= delt_at_any(ch);
//        System.out.println("list after delete");
//        display();
//        System.out.println("deleted element:  regno      marks    \n"+"\t"+temp3.regd_no+"      "+temp3.mark);
//        System.out.println("enter the reg no u want to find");
//        int reg=sc.nextInt();
//        searchRegNo(reg);
    // System.out.println("\t ll after reverse \t");
    // reverse();
    // display();
}
}