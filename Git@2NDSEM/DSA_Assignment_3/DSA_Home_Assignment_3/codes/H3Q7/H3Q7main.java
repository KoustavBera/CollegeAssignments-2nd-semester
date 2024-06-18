package H3Q7.java;
/*
Given an unsorted array, A, of integers
and an integer k, write recursive program using Java for
rearranging the elements in A so that all elements less
than or equal to k come before any
elements larger than k.
 */
public class H3Q7main {
    public static void swap(int[]a,int low,int high){
        int temp=a[low];
        a[low]=a[high];
        a[high]=temp;
    }
    public static void printA(int[]a){
        for(int e:a){
            System.out.println(e);
        }
    }
    public static void partition(int[]a,int low,int high,int k){
        if(low>high){
            return;
        }
        if(a[low]>k && a[high]<=k){
            swap(a,low,high);
            partition(a,low+1,high-1,k);
        }
        if (a[low]<a[high]) {
        partition(a,low+1,high,k);
        }
        if (a[high]>k) {
            partition(a,low,high-1,k);
        }
    }

    public static void main(String[] args) {
        int[]a={1,6,4,2,2,2,78};
        partition(a,0,a.length-1,3);
        printA(a);
    }

}

