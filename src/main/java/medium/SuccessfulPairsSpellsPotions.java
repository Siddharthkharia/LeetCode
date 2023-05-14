package medium;

import java.util.Arrays;

public class SuccessfulPairsSpellsPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];

        for(int i=0;i< spells.length;i++){
            int count=0;
            for(int j =0;j<potions.length;j++){
                if(spells[i]*potions[j]>=success){
                    count++;
                }
            }
            pairs[i]=count;
        }
        return pairs;
    }
    public int[] successfulPairs1(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];

        Arrays.sort(potions);

        for(int i=0;i<spells.length;i++){
            int l=0;
            int r= potions.length;
            int mid = 0;

            while(l<r){
                mid=l+(r-l)/2;
                if(spells[i]*potions[mid]<success){
                    l=mid+1;
                }else{
                    r=mid;
                }
            }
            pairs[i]= potions.length-l;
        }
        return pairs;
    }
}
