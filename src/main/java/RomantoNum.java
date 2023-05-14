import java.util.HashMap;

public class RomantoNum {
	
public static int romanToInt(String s) {
     int sum=0; 
     
     HashMap<Character, Integer> map = new HashMap<Character, Integer>();
     
     map.put('M', 1000);
     map.put('D', 500);
     map.put('C', 100);
     map.put('L', 50);
     map.put('X', 10);
     map.put('V', 5);
     map.put('I', 1);
     
     
     
     for(int i=0;i<s.length();i++) {
    	 Character c =s.charAt(i);
    	 
    	 try {
    		 if(map.get(c)<map.get(s.charAt(i+1))) {
        		 sum=sum-map.get(c);
        	 }
        	 else {
        		 sum=sum+map.get(c);
        	 }
    	 }catch(StringIndexOutOfBoundsException e) {
    		 sum=sum+map.get(c);
    	 }    	 
     }
     
     return sum;
    }

public static void main(String[] args) {
	String s="MCMXCIV";
	
	System.out.println(romanToInt(s));
}

}
