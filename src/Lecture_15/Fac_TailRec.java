package Lecture_15;

public class Fac_TailRec {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fac(n,1));
    }

    public static int fac(int n,int ans){
        //base case
        if (n==0){
            return ans;
        }

        return fac(n-1,ans*n);//Smaller Problem
    }
}
