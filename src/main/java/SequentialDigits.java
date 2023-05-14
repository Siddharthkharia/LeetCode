
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int low=1000;
		int high=13000;

		List<Integer> ll = sequentialDigits(low,high);

		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}

	}



	public static List<Integer> sequentialDigits(int low, int high) {

		List<Integer> results = new ArrayList<Integer>();

		for(int i=1;i<=9;i++) {

			//Simply create a StringBuilder and append the starting digit i
			StringBuilder sb= new StringBuilder(); 
			sb.append(i);

			//now iterate for the digits greater than i till 9 and append it to the Sb
			for(int j=i+1;j<=9;j++) {


				sb.append(j); //append the digit j to the existing string builder

				int potential=Integer.valueOf(sb.toString());

				//check if the potnetial number meets the criteria low<potential>high, if yes add the number to the list

				if(potential>=low && potential<=high) {
					results.add(potential);	
				}

				//check if the potential is greater than the high break out of the inner loop and start with the different i as starting digit
				if(potential>high) {
					break;
				}
			}

		}

		Collections.sort(results);
		return results;
	}

}
