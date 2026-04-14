package Recursion_Question;

public class Question_25 {
    public static void main(String[] args) {
        int num=10203050;
        int count=0;
        int result=0;
        System.out.println(RemoveZeros(num,count,result));
    }

    public static int RemoveZeros(int n, int count,int result){
        if (n%10 !=0){
            result+= (int) ((n%10)*Math.pow(10,count));
            count++;
        }
        if (n%10==n){
            return result;
        }
        return RemoveZeros(n/10,count,result);
    }
}
