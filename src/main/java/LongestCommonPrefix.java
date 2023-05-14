
public class LongestCommonPrefix {

	public static String comnPre(String s1,String s2) {
		int len=Math.min(s1.length(), s2.length());

		StringBuilder sb = new StringBuilder();

		for(int i=0;i<len;i++) {
			if(s1.charAt(i)==s2.charAt(i)) {
				sb.append(s1.charAt(i));
			}
			else {
				return sb.toString();
			}
		}
		return sb.toString();
	}

	public static String longestCommonPrefix(String[] strs) {

		String prefix="\"\"";

		if(strs.length>1) {
			
			prefix=comnPre(strs[0],strs[1]);

			for(int i=1;i<strs.length;i++) {
				
				System.out.println("checking the string :- "+ strs[i]+ " ,with the current Prefix :-" + prefix);

				if(!(strs[i].startsWith(prefix))) {
					
					prefix=comnPre(prefix,strs[i]);
					System.out.println("prefix value changed to "+prefix);
				}	
			}

			if(prefix=="") {
				prefix="\"\"";
			}
		}
		else {
			prefix=strs[0];
		}

		return prefix;

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] st = {"baab","bacb","b","cbc"};
		String s= longestCommonPrefix(st);


		System.out.println(s);

	}

}
