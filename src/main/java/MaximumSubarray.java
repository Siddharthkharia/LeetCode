
public class MaximumSubarray {

	public static int maxSubArray(int[] nums) {
		
		int max=nums[0];
		int sum=0;
		
		if(nums.length==1)
			return nums[0];
		
		
		for (int i=0;i<nums.length;i++) {
			sum=Math.max(sum+nums[i], nums[i]);
			max=Math.max(max, sum);
		}

		return max;
	}
	
	public static void main(String[] args) {

		int[] n= {5,4,-1,7,8};
		
		System.out.println(maxSubArray(n));
	}

}
