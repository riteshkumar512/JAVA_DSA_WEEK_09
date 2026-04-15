package AssignmentExtraQuestion;

import java.util.Scanner;

public class Smallest_Digit_in_a_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(smallestDigit(n,Integer.MAX_VALUE));

    }
    public static int smallestDigit(int n,int ans){
        int digit=n%10;
        ans=Math.min(digit,ans);
        if (n/10==0){
            return ans;
        }

       return smallestDigit(n/10,ans);
    }
}
