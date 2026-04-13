package Recursion_Question;

public class Qjuestion_22 {
    public static void main(String[] args) {
        int a=90;
        int b=30;
        System.out.println(GCD(a,b));
    }
    public static int GCD(int a, int b){
        if (b % a == 0){
            return  a;
        }
        return GCD(b % a,a);
    }
}
