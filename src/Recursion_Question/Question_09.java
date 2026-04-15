package Recursion_Question;

public class Question_09 {
    public static void main(String[] args) {
        int n=121;

        if(isPalindrome(n,reverseNum(n,0))){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
    public static boolean isPalindrome(int n,int revnum){
        return n == revnum;
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
