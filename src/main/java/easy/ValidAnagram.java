package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        Map<Character,Integer> count = new HashMap<>();
        for (char i:s.toCharArray()){
            count.put(i, count.getOrDefault(i,0)+1);
        }
        for (char i:t.toCharArray()){
            count.put(i, count.getOrDefault(i,0) -1 );
        }
        for (int val:count.values())
        {
            if(val!=0){
                return false;
            }
        }
        return true;
    }


}