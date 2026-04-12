package Recursion_Question;

public class Question_05 {
    public static void main(String[] args) {
        int n=9876;
        System.out.println(Count_digits(n));

    }
    public static int Count_digits(int n){
        if (n/10==0){
            return 1;
        }

        int C=Count_digits(n/10);
        return C+1;

    }
}
