package Array_2D_Doubt;

import java.util.Arrays;

public class Murthal_Parantha {
    public static void main(String[] args) {
        int paratha=10;
        int[] rank={1,2,4,3};

        System.out.println(minimum_time(rank,paratha));

    }
    public static int minimum_time(int[] rank, int paratha){
        int lo=0;
        int max= Arrays.stream(rank).max().getAsInt();
        int hi=max * (paratha * (paratha+1)/2);
        int ans=0;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(isItPossible(rank,paratha,mid)){
                ans=mid;
                hi=mid-1;
            }else {
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean isItPossible(int[] rank,int paratha,int mid){
        int count=0;
        for (int i = 0; i < rank.length; i++) {
            count+= Number_of_paratha(rank[i],mid);
            if (count>paratha){
                return true;
            }
        }
          return false;
    }


    public static int Number_of_paratha(int rank,int time){
        int tt=0;
        int p=1;
        while (tt + p * rank <= time){
            tt += p * rank;
            p++;
        }
        return p-1;
    }
}
