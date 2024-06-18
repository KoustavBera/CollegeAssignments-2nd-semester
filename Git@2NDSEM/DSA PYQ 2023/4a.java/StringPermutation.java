public class StringPermutation {
    public static void perm(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
        }
        //for each ch
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            perm(ros,ans+ch);
        }
    }

    public static void main(String[] args) {
        perm("ab","");
    }
}
