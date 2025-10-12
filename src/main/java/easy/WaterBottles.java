package easy;

import java.util.HashMap;
import java.util.Map;

public class WaterBottles {
    public static int[] empty;
    public static int[] bottles;


    public static void main(String args[]){
        int numBottles = 9;
        int numExchange =3;
        System.out.println("number of bottles can drink = " + numWaterBottles(numBottles,numExchange));
    }


    public static int numWaterBottles(int numBottles, int numExchange) {
        int sum =0;
        int emptyBottles =0;
        Map<String, Integer> memoMap = new HashMap<>();
        // return canDrink(numBottles, numExchange,emptyBottles,sum);
        return canDrinkDP(numBottles, numExchange,emptyBottles,memoMap);
    }

    public static int canDrink(int numBottles, int numExchange, int emptyBottles, int sum) {

        if(numBottles > 0){
            emptyBottles = emptyBottles+numBottles;
            sum = sum+numBottles;
            numBottles = 0;
            System.out.println("number of bottles drinked so far = " + sum);
        }
        if(emptyBottles >= numExchange){
            int canExchange = emptyBottles/numExchange;
            numBottles = numBottles+canExchange;
            emptyBottles = emptyBottles%numExchange;
            System.out.println("number of empty bottles after exchange = " + emptyBottles);
            return canDrink(numBottles, numExchange,emptyBottles,sum);
        }
        return sum;
    }

    public static int canDrinkDP(int numBottles, int numExchange, int emptyBottles, Map<String, Integer> memo){
        if(numBottles==0 && emptyBottles<numExchange){
            return 0;
        }

        String key = numBottles+ ","+emptyBottles;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int sum = numBottles;
        emptyBottles = emptyBottles+numBottles;
        numBottles = 0;

        // exchange
        int newBottles = emptyBottles/numExchange;
        emptyBottles = emptyBottles%numExchange;

        int result = sum + canDrinkDP(newBottles,numExchange,emptyBottles,memo);

        return result;
    }
}
