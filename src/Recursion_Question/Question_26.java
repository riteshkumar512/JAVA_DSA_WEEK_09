package Recursion_Question;

public class Question_26 {
    public static void main(String[] args) {
        int n=1020;
        System.out.println(CountZeros(n,0));

    }
    public static int CountZeros(int n,int count){
        if (n%10==0){
            count++;
        }
        if (n%10==n){
            return count;
        }
        return CountZeros(n/10,count);
    }
}
