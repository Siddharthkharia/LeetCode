import java.util.regex.*;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="AAAABB";
		
		System.out.println(detectCapitalUse(s));

		//System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		
	}
	public static boolean detectCapitalUse(String word) {
		
		if(word.equals(word.toUpperCase())) {
			return true;
		}
		else {
			if(word.equals(word.toLowerCase())) {
				return true;
			}
			else {
				if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()))
					return true;
				else
					return false;
			}
		}

	}

}
