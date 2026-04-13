package Recursion_Question;

public class Question_24 {
    public static void main(String[] args) {
        int n=2234;
        int sum=0;
        SumOfEven(n,sum);

    }
    public static void SumOfEven(int n,int sum){
        if (n%2==0){
            sum+= n%10;
        }
        if (n%10==n){
            System.out.println(sum);
            return;
        }
        SumOfEven(n/10,sum);
    }
}
