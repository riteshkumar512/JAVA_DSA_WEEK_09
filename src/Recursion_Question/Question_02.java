package Recursion_Question;

public class Question_02 {
    public static void main(String[] args) {
        int n=5;
        Print_Dec(n);
    }
    public static void Print_Dec(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        Print_Dec(n-1);
    }
}
