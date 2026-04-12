package Recursion_Question;

public class Question_05 {
    public static void main(String[] args) {
    int n=123;
        System.out.println(SumOfDigit(n));
    }
    public static int SumOfDigit(int n){
        if (n%10==n){
            return n;
        }
        int sum=SumOfDigit(n/10);
        return sum + n % 10;
    }
}
