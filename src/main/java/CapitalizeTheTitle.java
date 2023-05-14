
public class CapitalizeTheTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="First leTTeR of an EACH Word";
			
		
		System.out.print(capitalizeTitle(s));

	}

	public static String capitalizeTitle(String title) {
		
		String[] s=title.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length;i++) {
			s[i]=wordChecker(s[i]);
			sb.append(s[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	public static String wordChecker(String s) {
		
		if(s.length()<3) {
			return s.toLowerCase();
		}

		if(Character.isUpperCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toLowerCase())) {
			return s;
		}
		else {
			StringBuilder sb= new StringBuilder();
			sb.append(s.substring(0, 1).toUpperCase());
			sb.append(s.substring(1, s.length()).toLowerCase());
			return sb.toString();
		}

	}

}
