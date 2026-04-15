package Recursion_Question;

public class Question_08 {
    public static void main(String[] args) {
        int n=123;
        System.out.println(reverseNum(n,0));

    }
    public static int reverseNum(int n,int ans){
        int digit=n%10;
        ans=ans*10+digit;
        if (n/10==0){
            return ans ;
        }
        return reverseNum(n/10,ans);
    }

}
