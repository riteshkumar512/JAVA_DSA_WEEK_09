package AssignmentExtraQuestion;

import java.util.*;

public class Remove_Adjacent_Duplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        removeDublicate(s,0);
    }
    public static void removeDublicate(String s,int i){
        if (i == s.length()){
            return;
        }
        if (i==s.length()-1 || s.charAt(i)!= s.charAt(i+1)){
            System.out.print(s.charAt(i));
        }
        removeDublicate(s,i+1);
    }
}
