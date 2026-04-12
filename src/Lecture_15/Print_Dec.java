package Lecture_15;

public class Print_Dec {
    public static void main(String[] args) {
        int n=5;
        PD(n);
    }
    public static  void PD(int n){
        //base Case
        if (n==0){
            return;
        }
        //Smaller Problem
        System.out.println(n);
        PD(n-1);
    }
}
