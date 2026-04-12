package Recursion_Question;

public class Question_11 {
    public static void main(String[] args) {
        int[] arr={1,5,3,8,9,25};
        System.out.println(MaxElem(arr,0));


    }
    public static int MaxElem(int[] arr,int i){
        if (i == arr.length-1){
            return arr[i];
        }
        int ans=arr[i];
        return Math.max(ans ,MaxElem(arr,i+1));

    }
}
