package hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> need = new HashMap<>();
        for(char c : t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

        int count = t.length();
        int left =0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;

        for(int right=0 ; right<s.length();right++){
            char c = s.charAt(right);
            if(need.containsKey(c)){
                if(need.get(c)>0){
                    count--;
                }
                need.put(c,need.get(c)-1);
            }

            while (count == 0) {

                if(right-left+1<minLen){
                    minStart=left;
                    minLen=right-left+1;
                }

                char leftChar = s.charAt(left);
                if(need.containsKey(leftChar)){
                    need.put(leftChar,need.get(leftChar)+1);
                    if(need.get(leftChar)>0){
                        count++;
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "":s.substring(minStart,minStart+minLen);
    }
}
