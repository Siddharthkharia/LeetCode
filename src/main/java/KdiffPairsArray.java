import java.util.HashMap;
import java.util.HashSet;

public class KdiffPairsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {1,3,1,5,4};
		
//		System.out.println(findPairs(nums,3));
		System.out.println(test(nums,0));
	}

	public static int findPairs(int[] nums, int k) {

		int count=0;
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			if(!(set.contains(nums[i]))){
				set.add(nums[i]);

			HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
			
			System.out.println("new map created for nums i="+nums[i]);

			for(int j=i+1;j<nums.length;j++) {

				if(!(map.containsKey(nums[j]))) {

					if(Math.abs(nums[i]-nums[j])==k) {
						map.put(nums[j], true);
						count++;
						System.out.println("\tadding count for pair :- ("+nums[i]+", "+nums[j]+")");
					}
				}
			}
		}
		}
		return count;
	}
	
	public static int test(int[] nums, int k) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		
		int count=0;
		
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			System.out.println("value of "+nums[i]+" = "+map.get(nums[i]));
		}
		
		for(int i :map.keySet()) {
			System.out.println("checking for :- "+ i);
			if(k==0) {
				if(map.get(i)>=2) {
				System.out.println("\tk==0, count added for "+ i);
				count++;
				}
			}else {
				
				if(map.containsKey(i+k)) {
					System.out.println("\tcount added for :- ("+i+","+(i+k)+")");	
					count++;
				}
			}
		}
	return count;	
	}

}
