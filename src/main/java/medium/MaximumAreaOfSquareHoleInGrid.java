package medium;

import java.util.Arrays;

public class MaximumAreaOfSquareHoleInGrid {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxHorrizontal = conscutiveBars(hBars);
        int maxVertical = conscutiveBars(vBars);

        int side = Math.min(maxHorrizontal,maxVertical)+1;
        return side *side;
    }

    static int conscutiveBars(int[] bars){
        Arrays.sort(bars);
        int maxLen = 1;
        int currentLen = 1;
        if(bars.length>1){
            for (int i=1;i<=bars.length-1;i++){
                if(bars[i] == bars[i-1]+1){
                    currentLen++;
                }else{
                    currentLen =1;
                }
                maxLen = Math.max(maxLen,currentLen);
            }
        }
        return maxLen;
    }
}
