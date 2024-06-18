package H3Q8.java;
/*
In the Towers of Hanoi puzzle,
we are given a platform with three pegs,
a, b, and c, sticking
out of it. On peg a is a stack
of n disks, each larger than
the next, so that the smallest is on the
top and the largest is on the
bottom. The puzzle is to move all
the disks from peg a to peg c,
moving one disk at a time, so
that we never place a larger
disk on top of a smaller one. See
Figure 1 for an example of the
case n = 4. Write a recursive
program using Java for solving
the Towers of Hanoi puzzle for
arbitrary n. (Hint: Consider
first the subproblem of moving all
but the nth disk from peg a to another
peg using the third as “temporary storage.”)
 */
public class H3Q8main {
    public static void TOH(int n,char src,char mid,char dest){
        if(n==1){
            System.out.println("Moves from "+src+" to "+dest);
        }
        else{
            TOH(n-1,src,dest,mid);
            System.out.println("Moves from "+src+" to "+dest);
            TOH(n-1,mid,src,dest);
        }
    }

    public static void main(String[] args) {
        TOH(3,'A','B','C');
    }
}
