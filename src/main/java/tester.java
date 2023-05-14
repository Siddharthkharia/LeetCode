import java.util.Arrays;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(speedCal(1, 6));

	}
	
	public static boolean test(int[] pile, int h, int speed){
		
		int count=0;
		
		while (count<h) {
			for(int i=0;i<pile.length;i++) {
				
				if(pile[i]>0) {
					pile[i]=pile[i]-speed;
					count++;
				}
			}
		}
		Arrays.sort(pile);
		return pile[pile.length-1]>0 ? false:true;
	}
	
	public static int speedCal(float left, int right) {
		
		int s=Math.round((left+right)/2);
		return s;
	}

}
