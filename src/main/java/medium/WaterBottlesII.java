package medium;

public class WaterBottlesII {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        return maximumBottles(numBottles,numExchange,0,0);
    }

    public static int maximumBottles (int numBottles, int numExchange,int emptyBottles, int sum){

        if(numBottles==0 && emptyBottles < numExchange){
            return sum;
        }

        //drink the bottles
        if(numBottles>0){
            emptyBottles = emptyBottles + numBottles;
            sum = sum + numBottles;
            numBottles = 0;
        }else{
            //exchange the bottles
            if(emptyBottles>=numExchange){
                emptyBottles = emptyBottles - numExchange;
                numBottles = numBottles + 1;
                numExchange++;
            }
        }

        return maximumBottles(numBottles,numExchange,emptyBottles,sum);
    }
}
