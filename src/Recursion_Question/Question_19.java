package Recursion_Question;

public class Question_19 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(CountEven(arr,0,0));

    }
    public static int CountEven(int[]arr,int i,int co){
        if (i== arr.length){
            return co;
        }
        if (arr[i]%2==0){
            co++;
        }
        return CountEven(arr,i+1,co);
    }
}
