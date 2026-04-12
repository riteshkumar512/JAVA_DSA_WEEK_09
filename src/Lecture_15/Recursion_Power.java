package Lecture_15;

public class Recursion_Power {
    public static void main(String[] args) {
        int a=3;
        int n=4;
        System.out.println(pow(a,n));
    }
    public static int pow(int a, int n){
        //base case
        if (n==0){
            return 1;
        }
        //smaller problem
        int p=pow(a,n-1);
        return p*a;
    }
}
