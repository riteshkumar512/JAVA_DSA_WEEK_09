package Recursion_Question;

public class Question_20 {
    public static void main(String[] args) {
        String s="coding";
        System.out.println(CountVowel(s));

    }
    public static int CountVowel(String s){
        if (s.length()==0){
            return 0;
        }
        char ch=s.charAt(0);
        int c=0;
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
            c++;
        }
        return c + CountVowel(s.substring(1));
    }
}
