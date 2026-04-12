package Recursion_Question;

public class Question_04 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fac(n));
    }
    public static int fac(int n){
        if (n==0){
            return 1;
        }

        int f=fac(n-1);
        return f*n;

    }
}
