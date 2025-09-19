package easy;

import java.util.*;

public class MaximumNumberOfWordsYouCanType {

    public int canBeTypedWords(String text, String brokenLetters) {
        String[] textArr = text.split(" ");
        int count=0;
        Set<Character> broken = new HashSet<Character>();
        for(Character c : brokenLetters.toCharArray()){
            broken.add(c);
        }
        for(String s : textArr){
            Set<Character> tempLetters = new HashSet<Character>();
            boolean wordCheck = true;
            for(Character cd : s.toCharArray()){
                if(broken.contains(cd)){
                    wordCheck = false;
                    break;
                }
            }
            if(wordCheck) {
                count++;
            }
        }
        return count;
    }
}
