import java.util.Stack;
import java.util.function.ObjIntConsumer;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=1534236469;
		System.out.println(reverse(n));
		//System.out.println(n);
		

	}
	public static int reverse(int x) {
			
		int sum=0;
		
		int temp=Math.abs(x);
		int rem=0;
		int firstDigit=0;
		
		while(temp!=0) {
			firstDigit=temp;
			
			rem=temp%10;
			temp=temp/10;
			sum=sum*10+rem;
		}
		
		if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE)
				return 0;
		
		if(sum%10!=firstDigit)
			return 0;

		return x<0? (sum-2*sum):sum;

	}

}
