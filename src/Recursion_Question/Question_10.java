package Recursion_Question;

public class Question_10 {
    public static void main(String[] args) {
        int a=2,n=4;
        System.out.println(Power(a,n));
    }
    public static int Power (int a, int n){
        if (n==1){
            return a;
        }

        int p=Power(a,n-1);
        return p*a;
    }
}
