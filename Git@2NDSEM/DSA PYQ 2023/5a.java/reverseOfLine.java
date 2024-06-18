public class reverseOfLine {
    public static String reverse(String sentence){
        int spaceIndex=sentence.indexOf(' ');
        if(spaceIndex==-1){
            return sentence;
        }
        return reverse(sentence.substring(spaceIndex+1))+" "+sentence.substring(0,spaceIndex);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Iter is the worst college"));
    }
}
