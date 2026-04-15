package AssignmentExtraQuestion;

import java.util.Scanner;

public class Print_Array_in_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        printReverArr(arr,0);

    }
    public static void printReverArr(int[] arr,int i){
        if (i== arr.length){
            return;
        }
        printReverArr(arr,i+1);
        System.out.print(arr[i]+" ");
    }
}
