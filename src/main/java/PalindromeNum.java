
public class PalindromeNum {
	public boolean isPalindrome(int x) {
        String s1=Integer.toString(x);
        
        for(int i=0;i<(s1.length())/2;i++) {
        	if(s1.charAt(i)!=s1.charAt(s1.length()-i-1))
        		return false;
        }
        return true;
    }

}
