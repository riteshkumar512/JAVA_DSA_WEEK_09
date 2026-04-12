package Recursion_Question;

public class Question_12 {
    public static void main(String[] args) {
        int[] arr={1,5,3,5,0};
        System.out.println(MinElem(arr,0));
    }
    public static int MinElem(int[]arr,int i){
        if (i== arr.length-1){
            return arr[i];
        }
        int ans=arr[i];
        return Math.min(ans,MinElem(arr,i+1));


    }
}
