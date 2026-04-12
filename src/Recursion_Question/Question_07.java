package Recursion_Question;

public class Question_07 {
    public static void main(String[] args) {
        int n=234;
        System.out.println(ProductOfDigit(n));
    }
    public static int ProductOfDigit(int n){
        if (n%10==n){
            return n;
        }
        int ans=ProductOfDigit(n/10);
        return ans*(n%10);

    }
}
