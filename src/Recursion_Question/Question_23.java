package Recursion_Question;

import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long mul=a*b;
        long lcm=mul/GCD(a,b);
        System.out.println(lcm);
    }
    public static long GCD(long a, long b){
        if (b % a == 0){
            return  a;
        }
        return GCD(b % a,a);
    }
}
