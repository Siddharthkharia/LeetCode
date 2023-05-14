import java.util.HashMap;

public class WordPattern {

	public static String NumGen(String s) {
		
		System.out.println("Entered the pattern checker method");

		HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		StringBuilder sb = new StringBuilder();
		int count=1;

		for(int i=0;i<s.length();i++) {
			if(!(map.containsKey(s.charAt(i)))) {
	//logger
				System.out.println("New char found, entering new entry in the map :" + s.charAt(i) +" and counter value:- " + count);
				
				map.put(s.charAt(i), count);
				sb.append(count);
				count++;
			}
			else {
	//logger			
				System.out.println("Duplicate char "+ s.charAt(i)+ " and counter :- " + (count-1));

				sb.append(map.get(s.charAt(i)));
			}
		}
	//logger
		System.out.println(sb.toString());
		
		return sb.toString();
	}

	public static String NumGen(String[] s) {
	
	//logger

		System.out.println("Entered the String checker method");

		
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		int count=1;

		for(int i=0;i<s.length;i++) {

			if(!(map.containsKey(s[i]))) {
	
	//logger		
				System.out.println("New String found, entering new entry in the map :" + s[i] +" and counter value:- " + count);

				
				map.put(s[i], count);
				sb.append(count);
				count++;
			}
			else {

	//logger
				System.out.println("Duplicate String "+ s[i]+ " and counter :- " + (count-1));

				sb.append(map.get(s[i]));
			}
		}

	//logger
		System.out.println(sb.toString());
		return sb.toString();
	}


	public static boolean wordPattern(String pattern, String s) {
		
		if(NumGen(pattern).equalsIgnoreCase(NumGen(s.split(" ")))) {
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		String pat = "abba";
		String s = "dog cat cat dog";
		
		if(wordPattern(pat,s)) {
			
			System.out.println("true");
		}

		else {
			
			System.out.println("false");
		}
			
	}
}
