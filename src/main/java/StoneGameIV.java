
public class StoneGameIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(closestSq(8));

		System.out.println(winnerSquareGame(9));

	}

	public static int closestSq(int n) {

		int num=(int) Math.floor((Math.sqrt(n)));

		return num;
	}


	public static boolean winnerSquareGame(int n) {

		int remains=n;

		int turn=0;

		String name="Alice";

		for (int i=0;i<n;i++) {

			if(remains==0) {
				System.out.println("Since Remains is now Zero no further turns can be played, last turn played by :- "+ name);
				break;
			}
			else {
				
				
				turn=(int) Math.pow(closestSq(remains), 2);

				System.out.println(i+" turn is now being played for " +turn+" while remains = "+remains);

				if(remains>=turn) {

					name = i%2==0 ? "Alice":"Bob";

					remains=remains-turn;
					System.out.println("\t"+name + "  played its turn for :- "+ turn+" stones, now the remaining stones are :- " + remains);

				}
				else {
					System.out.println("Since Remains is now less than the square, no further turns can be played, last turn played by :- "+ name);
					break;

				}

			}
		}
		//System.out.println("Returning the las return");
		return name=="Alice"? true:false;

		}
		//		return nxt%2==0 ? false:true;
	}

