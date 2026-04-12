package Recursion_Question;

public class Question_03 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Sum_Num(n));
    }
    public static int Sum_Num(int n){
        if (n==0){
            return 0;
        }

        int S=Sum_Num(n-1);
        return S+n;

    }

}
