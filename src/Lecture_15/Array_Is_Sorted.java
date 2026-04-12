package Lecture_15;

public class Array_Is_Sorted {
    public static void main(String[] args) {
        int[] arr={3,5,7,8,9};
        System.out.println(IsSorted(arr,0));

    }
    public static boolean IsSorted(int[] arr,int i){
    if (i == arr.length-1){
        return true;
    }

        if (arr[i] > arr[i+1]){
            return false;
        }
         return IsSorted(arr,i+1);
    }
}
