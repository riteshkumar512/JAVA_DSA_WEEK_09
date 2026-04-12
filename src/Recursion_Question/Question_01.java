package Recursion_Question;

public class Question_01 {
    public static void main(String[] args) {
        int n=5;
        Print(n);
    }
    public static void Print(int n){
        if (n==0){
            return;
        }

        Print(n-1);
        System.out.println(n);
    }
}
