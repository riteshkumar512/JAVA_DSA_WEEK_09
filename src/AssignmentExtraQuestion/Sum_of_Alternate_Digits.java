package AssignmentExtraQuestion;

import java.util.*;

public class Sum_of_Alternate_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        String s= Integer.toString(num);
        System.out.println(alternateSum(s,0,0));

    }
    public static int alternateSum(String s, int ans,int i){
        if (i>=s.length()){
            return ans;
        }
        int digit =s.charAt(i)- '0';
        ans+= digit;
        return alternateSum(s,ans,i+2);
    }
}
