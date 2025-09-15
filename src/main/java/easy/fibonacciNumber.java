package easy;

import java.awt.*;
import java.util.ArrayList;

public class fibonacciNumber {
    static Integer[] memo ;
    public int fib(int n){
        memo = new Integer[n + 1];
        memo[0]=0;
        memo[1]=1;
        return fiboRecurssive(n);
    }

    public static int fiboRecurssive(int n){
        if(memo[n]!=null){
            return memo[n];
        }else{
            if(n ==0){
                return 0;
            } else if (n ==1) {
                return 1;
            }else{
                memo[n] = fiboRecurssive(n-1)+fiboRecurssive(n-2);
                return memo[n];
            }
        }
    }
}
