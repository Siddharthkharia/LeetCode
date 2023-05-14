import java.util.HashMap;

public class MajorityElement169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,2,1,1,1,1,1,2,2};
		
		System.out.println(majorityElement(nums));

	}

	public static int majorityElement(int[] nums) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int max=0;
		
		int val=0;
		
		for(int i=0;i<nums.length;i++) {
			
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			
			if(max<map.get(nums[i])) {
				max=map.get(nums[i]);
				val=nums[i];
			}
			
		}
		
		return val;

	}

}
