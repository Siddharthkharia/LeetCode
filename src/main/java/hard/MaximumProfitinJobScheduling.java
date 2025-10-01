package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MaximumProfitinJobScheduling {
    public static int[] dp;

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int len = startTime.length;
        dp = new int[len];
        Arrays.fill(dp,-1);

        List<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            jobs.add(new int[]{startTime[i], endTime[i], profit[i]});
        }

        jobs.sort(Comparator.comparingInt(a -> a[0]));

        for(int i=0; i<startTime.length;i++){
            startTime[i]= jobs.get(i)[0]; // sorting the start time array in respect to jobs list
        }

        return findMaxProfit(jobs,startTime,len, 0);

    }

    private int findMaxProfit(List<int[]> jobs, int[] startTime, int n,int position){
        if(position==n){
            return 0;
        }
        if(dp[position]!=-1){
            return dp[position];
        }

        int skip = findMaxProfit(jobs,startTime,n,position+1);

        int currentEndTime = jobs.get(position)[1];
        int nextIndex = findNextJob(startTime,currentEndTime);
        int take = findMaxProfit(jobs,startTime,n,nextIndex)+ jobs.get(position)[2];
        int maxProfit = Math.max(skip,take);

        dp[position] = maxProfit;
        return maxProfit;
    }


    public int findNextJob(int[] startTime, int currentEndTime){

        int left = 0;
        int right = startTime.length-1;
        int nextIndex = startTime.length;;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(startTime[mid]>=currentEndTime){
                nextIndex = mid;
                right = mid -1;
            }else{
                left = mid +1 ;
            }
        }
        return nextIndex;
    }
}