package H3Q2.java;
/*
Write a recursive method in Java to search an
element of an array using binary search.
 */
public class H3Q2main {
public static boolean recBS(int[]a,int st,int end,int target){

    if(st>end) return false;
    int mid=(st+end)/2;
    if(a[mid]==target) return true;
    else if(a[mid]>target) return recBS(a,st,mid-1,target);
    else return recBS(a,mid+1,end,target);
}

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int target=3;
        System.out.println("Binary search:"+recBS(a,0,a.length-1,target));
    }
}
