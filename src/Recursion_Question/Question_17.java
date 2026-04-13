package Recursion_Question;

public class Question_17 {
    public static void main(String[] args) {
        int[]arr={1,2,3,2};
        int item=2;
        System.out.println(LastOccurance(arr,item,0,0));
    }
    public static int LastOccurance(int[]arr,int item, int i,int pos){
        if (i== arr.length){
            return pos;
        }
        if (arr[i]==item){
            pos=i;
        }
        return LastOccurance(arr,item,i+1,pos);
    }
}
