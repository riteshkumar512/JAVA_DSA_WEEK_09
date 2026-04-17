package AssignmentExtraQuestion;

import java.util.*;

public class Convert_String_to_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(StrToInt(s,0));
    }
    public static int StrToInt(String s ,int num){
        if (s.length()==0){
            return num;
        }
        int digit = s.charAt(0) - '0';
        if (digit >=0  && digit <= 9){
            num=num*10+digit;
        }
       return StrToInt(s.substring(1),num);

    }
}
