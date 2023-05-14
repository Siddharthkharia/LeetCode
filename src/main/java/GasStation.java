
public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



	}

	public int canCompleteCircuit(int[] gas, int[] cost) {

		int start=0;
		int fuel=0;

		for(int i=0;i<gas.length;i++) {
			fuel+=gas[i]-cost[i];
		}
		if(fuel<0)
			return -1;
		else
			fuel=0;

		for(int i=0;i<gas.length;i++) {			
			fuel=fuel+gas[i]-cost[i];

			if(fuel<0) {
				start=i+1;
				fuel=0;
			}
		}

		return start;
	}

}
