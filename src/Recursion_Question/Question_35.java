package Recursion_Question;

public class Question_35 {
    public static void main(String[] args) {
        int[]arr={1,2,2,6};
        System.out.println(isStrictlyIncre(arr,0));

    }
    public static boolean isStrictlyIncre(int[]arr,int i){
        if (i== arr.length-1){
            return true;
        }
        if (arr[i]>= arr[i+1]){
            return false;
        }
        return isStrictlyIncre(arr,i+1);
    }
}
