package Lecture_15;

public class Sum_Of_N_Number {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));

    }
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        int S=sum(n-1);
        return S+n;
    }
}
