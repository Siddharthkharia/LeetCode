package easy;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        Set<Character> set = new HashSet<>();
        String common1 = getRepeating(str1);
        String common2 = getRepeating(str2);
        if(common1.equals(common2)){
            return common1;
        }
    return "";
    }

    public static String getRepeating(String word){
        Set<Character> set = new HashSet<>();
        StringBuilder shortest = new StringBuilder();
        for(int i=0;i<=word.length()-1;i++){
            set.add(word.charAt(i));
        }

        for(Character c : set){
            shortest.append(c);
        }

        return shortest.toString();
    }
}
