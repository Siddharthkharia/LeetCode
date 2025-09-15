package medium;

import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        String s ="";
        Map<Character,Integer> charMap = charCount(s);

    }

    public static Map<Character,Integer> charCount(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        return map;
    }

}
