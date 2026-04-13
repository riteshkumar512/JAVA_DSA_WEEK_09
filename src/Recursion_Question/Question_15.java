package Recursion_Question;

public class Question_15 {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,2};
        int item=2;
        System.out.println(EleCount(arr,item,0,0));


    }
    public static int EleCount(int[]arr,int item,int i,int co){
        if ( i== arr.length){
            return co;
        }
        if (arr[i] == item){
            co++;
        }
        return EleCount(arr,item,i+1,co);
    }
}
