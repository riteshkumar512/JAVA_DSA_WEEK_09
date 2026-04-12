package Lecture_15;

public class Recursion {
    public static void main(String[] args) {
    int n=5;
        System.out.println(fac(n));
    }

    public static int fac(int n){
        //base case
        if (n==0){
            return 1;
        }

        int f=fac(n-1);//Smaller Problem
        return  f*n;

    }
}
