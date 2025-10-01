package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Round 2 Coding Airbnb Sample
An employee is given a list of N tasks. A deadline is associated with each task and some reward points are allotted to
the employee if the corresponding tasks are completed within the deadline. Every task takes one unit of time to get
completed and only one task can be done at a time. The minimum possible deadline for any task is 1.
Write a program to determine the order of task execution to maximize the total rewards points for the employee.
 */
public class MaximumProfitJob {
    public int maximumProfit(int[]id,int[] deadline, int[] profit){
        int len = id.length;
        List<List<Integer>> jobs= new ArrayList<>();
        int maxDeadline = Integer.MIN_VALUE;
        for(int i =0;i<len-1;i++){
            List<Integer> job = new ArrayList<>();
            job.add(id[i]);
            job.add(deadline[i]);
            job.add(profit[i]);

            jobs.add(job);
            maxDeadline = Math.max(maxDeadline,deadline[i]);
        }

        jobs.sort(Comparator.comparingInt(job->job.get(2)));

        int[] freeSlots = new int[maxDeadline+1];

        Arrays.fill(freeSlots,-1);
        freeSlots[0]=0;
        int lastIndexUsed = maxDeadline;
        int sum=0;
        for(List<Integer> job: jobs){
            int currentProfit = job.get(2);
            int currentDeadLine = job.get(1);

            lastIndexUsed= getFreeSlot(freeSlots,currentDeadLine,lastIndexUsed);

            if (lastIndexUsed > 0) {
                freeSlots[lastIndexUsed] = currentProfit;
                sum=sum+currentProfit;
            }
        }
        return sum;
    }

    public int getFreeSlot(int[] freeSlots,int currentDeadLine, int lastIndex){

        while(lastIndex>0){
            if(freeSlots[lastIndex]==-1){
                return lastIndex;
            }else{
                return getFreeSlot(freeSlots,currentDeadLine,lastIndex--);
            }
        }
        return 0;
    }
}
