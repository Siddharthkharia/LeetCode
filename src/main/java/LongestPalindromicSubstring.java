import java.util.Collections;
import java.util.HashMap;



public class LongestPalindromicSubstring {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abbad";
		
		//System.out.println(longestPalindrome(s));
		System.out.println(test(s));
	
	}

	public static String longestPalindrome(String s) {
		int l=s.length();
		String res=" ";

		int len=0;

		for(int i=0;i<l;i++) {

			for(int j=l-1;j>=i;j--) {

				String temp=s.substring(i, j+1);

				if(palindrome(temp)) {

					if(temp.length()>len) {
						res=temp;
						len=res.length();
					}
				}

			}
		}
		return res;
	}

	public static boolean palindrome(String s) {

		for(int i=0;i<s.length()/2;i++) {
			if(!(s.charAt(i)==s.charAt(s.length()-1-i))) {

				return false;
			}				}
		return true;
	}


static HashMap<String,Boolean> map= new HashMap<String,Boolean>();
static int max=Integer.MIN_VALUE;
static String res=" ";

	public static String test(String s) {
		
		int n=s.length();
		
		for(int i=0;i<n;i++) {
			
			for(int j=n-1;j>=i;j--) {
				
				if(map.containsKey(s)) {
					map.get(s);
				}
				else {
					if(palindrome(s)) {
						map.put(s, true);
						res= s.length()>res.length() ? s:res;
						max=res.length();
					}
					else {
						map.put(s, false);
					}
				}
			}
		}
		return res;
	}

}
