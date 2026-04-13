package Recursion_Question;

public class Question_21 {
    public static void main(String[] args) {
        int Num=7;
        System.out.println(IsPrime(Num,Num-1));
    }
    public static boolean  IsPrime(int num,int D){
        if (D==1){
            return true;
        }
        if (num % D==0){
            return false;
        }
        return IsPrime(num,D-1);
    }
}
