package Recursion_Question;

public class Question_18 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        PrintArrElem(arr,0);

    }
    public static void PrintArrElem(int[]arr,int i){
        if (i== arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        PrintArrElem(arr,i+1);
    }
}
