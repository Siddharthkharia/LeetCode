import java.util.Arrays;

public class BestTimeBuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProfit(int[] s) {
        
		int min=Integer.MAX_VALUE;
		int profit=0;
		
		
		for(int i=0;i<s.length;i++) {
			
			if(min>s[i]) {
				min=s[i];
			}
			else {
				if(s[i]-min>profit) {
					profit=s[i]-min;
				}
			}
		}
		return profit;
    }

}
