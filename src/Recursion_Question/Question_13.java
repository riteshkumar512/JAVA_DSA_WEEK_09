package Recursion_Question;

public class Question_13 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(SumOfArray(arr,0));
    }
    public static int SumOfArray(int[]arr,int i){
        if (i==arr.length-1){
            return arr[i];
        }
        int sum=SumOfArray(arr,i+1);
        return sum+arr[i];
    }
}
