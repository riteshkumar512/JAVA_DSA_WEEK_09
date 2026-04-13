package Recursion_Question;

public class Question_16 {
    public static void main(String[] args) {
        int []arr={1,5,2,3,2};
        int item=2;
        System.out.println(FirstOccurance(arr,item,0));
    }
    public static int FirstOccurance(int[] arr,int item,int i){
        if (i== arr.length){
            return -1;
        }
        if (arr[i]==item){
            return i;
        }
        return FirstOccurance(arr,item,i+1);
    }
}
