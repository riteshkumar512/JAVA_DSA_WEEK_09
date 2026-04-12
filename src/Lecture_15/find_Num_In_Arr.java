package Lecture_15;

public class find_Num_In_Arr{
    public static void main(String[] args) {
        int[] arr={2,3,5,4,5};
        int item=5;
        System.out.println(search(arr,item,0));

    }
    public static int search (int[] arr,int item,int i){
        if (i==arr.length){
            return -1;
        }

        if (arr[i]==item){
            return i;
        }
        return search(arr,item,i+1);




    }
}
