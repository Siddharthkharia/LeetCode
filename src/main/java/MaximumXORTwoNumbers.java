
public class MaximumXORTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] n= {8,10,2};
		
		//System.out.println(findMaximumXOR(n));
		System.out.println(binarySum(8,2));

	}


	public static int findMaximumXOR(int[] nums) {
		
		int sum=0;
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				int temp=binarySum(nums[i], nums[j]);
			//	System.out.print("current value of sum is:- "+sum+" and obtained from function is :- "+temp+", Sum is now ");
				sum=Math.max(sum,temp);
			//	System.out.println(sum);
			}
		}
		return sum;
	}

	public static int binarySum(int x, int y) {
		
		String a=Integer.toBinaryString(x);
		String b=Integer.toBinaryString(y);
		
		System.out.println("length of num :- "+x + " is :- "+a.length() + " with bin num as " + a);
		System.out.println("length of num :- "+y + " is :- "+b.length() + " with bin num as " + b);
		
		StringBuilder resSb = new StringBuilder();
		int diff=0;
		String bigger=null;
		String smaller=null;
		int limit=0;
		
		
		if(a.length()>b.length()) {
			diff=a.length()-b.length();
			bigger=a;
			smaller=b;
			limit=a.length();
		}
		else {
			diff=b.length()-a.length();
			bigger=b;
			smaller=a;
			limit=b.length();
		}
//loggers
	
		System.out.println("dif between the length of strings is :- "+ diff);
		System.out.println("max lenth or limit is :- "+limit);
		
	
		if(diff!=0) {
			for(int i=0;i<diff;i++) {
				if(bigger.charAt(i)=='1') {	
					resSb.append('1');
					System.out.println("appended 1 in the Sb res");					
				}
				else {
					resSb.append('0');
					System.out.println("appended 0 in the Sb res");
				}
					

			}
		}
		
		
		for(int i=diff;i<limit;i++) {
			if(bigger.charAt(i)!=smaller.charAt(i-diff))
				resSb.append('1');
			else
				resSb.append('0');
		}
		
		System.out.print("binary Sum of the numbers "+x+" and "+y+" is :- "+resSb.toString());
		int results= Integer.parseInt(resSb.toString(), 2);
		System.out.println(", and the Integer sum is :- "+ results);
		return results;
		
	}

}
