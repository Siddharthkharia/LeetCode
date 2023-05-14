
public class TwoSum {

		public int[] twoSum(int[] nums, int target) {
			
			int sols[] = {0,0};
			
			for (int i=0;i<nums.length-1;i++) {
				
				for(int j=i+1;j<nums.length;j++) {
					if(nums[i]+nums[j]==target) {
						sols[0]=i;
						sols[1]=j;
						
						return sols;
					}
				}
				
			}
			return sols;
    }

}
