import java.util.Stack;

public class LongestSubstringWithoutRepeatingCharacters {
	
public static Stack<String> stRemover(Stack<String> st,int till) {
		
		for(int i=0;i<=till;i++) {
			st.remove(0);
		}
		return st;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
		
		String s="abcabcbb";
		

//		System.out.println(s.length());
		
	//	System.out.println(s.substring(2, 6).length());
		
//		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(testStack(s));
		
		

	}

	public static int lengthOfLongestSubstring(String s) {
		
		int len=0;
		int start=0;
		int end=0;
		int temp=0;
		
		for(int i=0;i<s.length()-1;i++) {			
			
			char c=s.charAt(i);

			System.out.println("checking for char :- "+ c);
			
			for(int j=i+1;j<s.length();j++) {
				
				if(c==s.charAt(j)) {
					break;
				}
				else {
					temp=j;
				}
			}
			if(len<s.substring(i, temp+1).length()) {
				start=i;
				end=temp;
				len=s.substring(start, end+1).length();
			}
		}
		System.out.println(start);
		System.out.println(end);
		return len;
	}
	
	

	
	
	public static int testStack(String s) {
		
		Stack<String> st = new Stack<String>();
		int len=0;
		
		
		for(int i=0;i<s.length();i++) {
			
			String c=s.substring(i, i+1);
			
			if(st.contains(c)) {
				len=Math.max(len, st.size());			
				
				st=stRemover(st, st.indexOf(c));
				
				st.push(c);
//				System.out.println(st.peek()+"<Peek char");
				
			}
			else {
				st.push(c);
				len=Math.max(len, st.size());
			}			
			
		}
		
		return len;
	}
	
	
	
	
	
}
