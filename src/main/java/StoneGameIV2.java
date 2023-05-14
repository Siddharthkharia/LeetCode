
public class StoneGameIV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(winnerSquareGame(8));

	}



	Boolean[] dp=new Boolean[100000+1]; ///creating a dynamic boolean array for storing the already calculated n
	
	
	public static boolean winnerSquareGame(int n) {
		boolean winner=false;
		if(n==0)
			return false;
		if(dp[n]!=null) return dp[n];	//simply return the already calculated value of n if the value is present in the dynamic array	

		//below calculation will only be calculated if the value for n is not present in the dynamic array
		
		for(int i=1;i*i<=n;i++) {
			if(!winnerSquareGame(n-i*i)) {
				winner=true;
				break;
			}
		}
		return dp[n]=winner; //returning and storing the value for n in the dynamic array for index n
	}

}
