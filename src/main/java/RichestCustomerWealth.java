import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,8,7},{7,1,3},{1,9,5}};
		
		int b[][]={{1,5},{7,3},{3,5}};
		
		System.out.println(maximumWealth(b));
	}

	public static int maximumWealth(int[][] accounts) {
		
		int li=accounts.length;
		int lj=accounts[0].length;
		int gap =0;
		int[] sum=new int[li];	
		while(gap<Math.max(li, lj)) {
			System.out.println("gap is :- "+ gap);
			
			for(int i=0,j=gap;i<li && j<lj;i++,j++) {
				System.out.println("\tTravering the object a["+i+"]["+j+"]");
				sum[i]+=accounts[i][j];
			}
			if(gap>0) {
				for(int i=gap,j=0;i<li && j<lj;i++,j++) {
					System.out.println("\tTravering the object a["+i+"]["+j+"]");
					sum[i]+=accounts[i][j];
				}
			}

			gap++;
		}
		Arrays.sort(sum);
		return sum[li-1];
	}

}
