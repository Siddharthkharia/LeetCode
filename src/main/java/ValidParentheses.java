import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "(])";
		if(sol (s)==true)
			System.out.println("balanced");
		else
			System.out.println("not balanced");
		}


	public static boolean sol(String s) {

		Stack<Character> st=new Stack<Character>();

		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);

			if(c=='{' || c=='[' || c=='(') {
				st.push(c);
			}
			else {
				try {
					if(c==')' && st.peek()=='(') {
						st.pop();
					}
					else {
						if(c=='}' && st.peek()=='{') {
							st.pop();
						}
						else {
							if(c==']' && st.peek()=='[') {
								st.pop();
							}
							else {
								return false;
							}
						}
					}	
				}catch(EmptyStackException e) {
					return false;
				}
			}

		}
		return st.isEmpty() ? true:false;
	}

}
