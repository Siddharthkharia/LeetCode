import java.util.Arrays;

public class KokoEatingBananas {

	public static int minEatingSpeed(int[] piles, int h) {

		Arrays.sort(piles);

		int max=piles[piles.length-1];
		int left=1;
		int right=max;
		int speed=speedCal(left,right);
		
		for(int i =0;i<max;i++) {
			if(speedChecker(piles,h,i)) {
				return i;
			}
		}
		return speed;

	}

	public static int speedCal(float left, int right) {

		int s=Math.round((left+right)/2);
		return s;
	}

	public static boolean speedChecker(int[] pile, int h, int speed){

		int count=0;

		while (count<h) {
			Arrays.sort(pile);

			System.out.println("piles array sorted in asc order");

			for(int i=pile.length-1;i>=0;i--) {

				if(pile[i]>0) {
					System.out.println("i="+i+" , " + " and the pile value is :- "+ pile[i]);
					pile[i]=pile[i]-speed;
					count++;
					System.out.println("i="+i+" , pile value change to :- "+ pile[i]+ " and counter is now at :- "+ count);
				}
				else {
					System.out.println("i="+i+" , no change to pile value = "+ pile[i]+ " and no change to counter :- "+ count);
					count++;
				}
			}
		}
		Arrays.sort(pile);
		System.out.println(pile[pile.length-1]);
		return pile[pile.length-1]>0 ? true:false;
	}


	public static boolean teste(int[] pile, int speed, int h) {

		int[] p=pile;

		int count=0;
		Arrays.sort(p);

		while(count<=h) {

			for(int i=0;i<p.length;i++) {
				System.out.println("the pile value is :- "+p[i]);

				if(p[i]>speed) {
					p[i]=p[i]-speed;
					count++;
				}
				else {
					p[i]=0;
					count++;	
				}
				System.out.println("new pile value is "+ p[i]+ " and the counter is "+ count);
			}	
		}

		if(p[0]==0)
			return true;
		else
			return false;

	}


	public static void main(String[] args) {
		int[] pp= {3,6,7,11};
		int h =8;

		System.out.println(minEatingSpeed(pp,h));

				if(speedChecker(pp,h,3)) {
					System.out.println(true);
				}
				else
					System.out.println(false);

	}
}
