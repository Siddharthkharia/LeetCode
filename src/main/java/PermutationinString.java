import java.util.ArrayList;
import java.util.Arrays;

public class PermutationinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab";
		String s2 = "eidbaooo";
		
		System.out.println(checkInclusion(s1,s2));
	}
	public static boolean checkInclusion(String s1, String s2) {
		if(s1.length()>s2.length())
			return false;
		
		char[] sa1= s1.toCharArray();
		Arrays.sort(sa1);
		
		int l1=s1.length();
		int l2=s2.length();
		
		for(int i=0;i<=l2-l1;i++) {
			
			if(isanagram(sa1,s2.substring(i, i+l1)))
				return true;
		}
		return false;
	}
	
	public static Boolean isanagram(char[] sa1, String s2) {
		
		char[] sa2= s2.toCharArray();
		
				
		Arrays.sort(sa2);
		s2= new String(sa2);
		
		
		for(int i=0;i<sa1.length;i++) {
			if(sa1[i]!=sa2[i])
				return false;
		}
		
//		if(s1.equals(s2))
//			return true;
//		else
//			return false;
		return true;
	}

}
