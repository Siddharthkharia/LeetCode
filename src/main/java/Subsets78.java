import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] n = {1,2,3};

		List<List<Integer>> li =test2(n,2);

		System.out.println(li);

	}

	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> fin = new ArrayList<List<Integer>>();


		for(int i=0;i<nums.length;i++) {
			//fin.add(test(nums,i));
		}
		return fin;
	}


	public static List<List<Integer>> test(int[] num){

		List<List<Integer>> res= new ArrayList<List<Integer>>();

		int len=1;

		while(len<=num.length){

			for(int i=0;i<=num.length-len;i++) {

				List<Integer> curr= new ArrayList<Integer>();

				int count=0;

				while(count<=len) {
					curr.add(num[i+count]);
					count++;
				}
				res.add(curr);
			}
			len++;
		}
		return res;	
	}

	public static List<List<Integer>> test2(int[] num, int len){

		List<List<Integer>> res= new ArrayList<List<Integer>>();

		for(int i=0;i<=num.length-len;i++) {

			List<Integer> curr= new ArrayList<Integer>();


			for(int j=i;j<num.length;j++) {

				int count=0;
				
				while(count<len) {

					if(num.length-j>=len) {
						curr.add(num[j]);
						count++;
					}
					else
						break;
				}					
			}

			res.add(curr);
		}

		return res;	
	}

}
