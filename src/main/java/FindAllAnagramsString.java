import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aacbebabacd";
		String p="bbb";
		//System.out.println(conv(s));
		//conv(s);
		List<Integer> lis= new ArrayList<Integer>();
		lis=test(s,p);
		
		for(int i=0;i<lis.size();i++) {
			System.out.println(lis.get(i));
		}
	}

	public static List<Integer> findAnagrams(String s, String p) {
		int len=p.length();
		List<Integer> li= new ArrayList<Integer>();
		
		if(p.length()>s.length())
			return li;
				
		//System.out.println("String passed to func is :- "+p);
		
		p=conv(p);
		
		for(int i=0;i<=s.length()-len;i++) {
			String comp= s.substring(i, i+len);
			if(dp.containsKey(comp)) {
				if(dp.get(comp)==true) {
					li.add(i);
				}
				else {
					break;
				}
			}
			else {
				
//				System.out.println("\tCompairing the String :- " + comp);
				if(conv(comp).equals(p)) {
					dp.put(comp, true);
					li.add(i);
				}
				else {
					dp.put(comp, false);
				}
			}	
		}
		return li;
	}
	
	static HashMap<String, Boolean> dp= new HashMap<String,Boolean>();
	
	public static String conv(String s) {

		char[] arr= s.toCharArray();
		Arrays.sort(arr);

		return Arrays.toString(arr);

		}
	
	public static List<Integer> test(String s, String p) {
		
		List<Integer> list = new ArrayList<Integer>();
		if(p.length()>s.length())
            return list;
		
		char arrayp[] = p.toCharArray();
	    Arrays.sort(arrayp);
	    
	    for(int i = 0;i<=s.length()-p.length();i++){
	        char array[] = (s.substring(i,i+p.length())).toCharArray();
	        Arrays.sort(array);
	        if(Arrays.equals(array,arrayp)){
	            list.add(i);
	        }
	    }
	    return list;
		}
	
	public static List<Integer> tester(String s, String p) {
		List<Integer> list=new ArrayList<Integer>();
		
		if(p.length()>s.length()) {
			return list;
		}
		
		
		HashMap<Character,Integer> pmap =new HashMap<Character,Integer>();
		for(int i=0;i<p.length();i++) {
			if(!(pmap.containsKey(p.charAt(i)))) {
				pmap.put(p.charAt(i), 1);
			}
			else {
				pmap.put(p.charAt(i), pmap.get(p.charAt(i))+1);
			}
		}
		
		for(int i=0;i<=s.length()-p.length();i++) {
			if(isAnagram(pmap,s.substring(i, i+p.length()))){
				list.add(i);
			}
		}
		return list;
	}
	
	
	
	public static boolean isAnagram(HashMap<Character, Integer> pmap, String subs) {
		
		HashMap<Character,Integer> smap= new HashMap<Character, Integer>();
		for(int i=0;i<subs.length();i++) {
			if(!(smap.containsKey(subs.charAt(i)))) {
				smap.put(subs.charAt(i), 1);
			}
			else {
				smap.put(subs.charAt(i), smap.get(subs.charAt(i))+1);
			}
		}
		
		for(char c:pmap.keySet()) {
			if(smap.containsKey(c)) {
				if(!(pmap.get(c)==smap.get(c))) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	 public static List<Integer> findAnagramsSubmitted(String s, String p) {
			List<Integer> list=new ArrayList<Integer>();
		        if(s.length()<p.length())
		        return list;
		        int[] phash=new int[26];
		        for(int i=0;i<p.length();i++){
		            int temp1=p.charAt(i)-'a';
		                phash[temp1]++;	
		            
		        }
		        for(int i=0;i<=s.length()-p.length();i++){
		            int[] shash=new int[26];
		            for(int j=0;j<p.length();j++){
		                int temp2=s.charAt(i+j)-'a';
		                shash[temp2]++;
		            }
		            int k=0;
		            while(k<26 && phash[k]==shash[k] )k++;
		            
		            if(k==26) list.add(i);
		        }
		        return list;
		    }

	
	
	}
