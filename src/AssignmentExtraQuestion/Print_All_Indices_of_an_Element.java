package AssignmentExtraQuestion;

import java.util.Scanner;

public class Print_All_Indices_of_an_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        indicesOfElem(arr,0,target);


    }
    public static void indicesOfElem(int[]arr,int i,int target){
        if (i==arr.length){
            return;
        }
        if (arr[i]==target){
            System.out.print(i+" ");
        }
        indicesOfElem(arr,i+1,target);
    }
}
