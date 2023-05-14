import java.util.HashMap;

public class FourSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		int count=0;
		
		for(int n1:nums1) {
			for(int n2:nums2) {
				map.put(n1+n2, map.getOrDefault(n1+n2, 0)+1);
			}
		}
		
		for(int n3:nums3) {
			for(int n4:nums4) {
				if(map.containsKey(-(n3+n4))) {
					count+=map.get(-(n3+n4));
				}
			}
		}
		return count;
	}

}
