package easy;

import java.util.Arrays;
import java.util.Stack;

public class ReverseVowelsString {
    public String reverseVowels(String s) {
        Stack<Character> vowelsStack = new Stack<>();
        int len = s.length();
        char[] arr = s.toCharArray();

        for(int i=0;i<=len-1;i++){

            if(isVowel(s.charAt(i))){
                vowelsStack.push(s.charAt(i));
            }else{
                arr[i] = s.charAt(i);
            }
        }

        for(int i=0; i<len;i++){
            if(isVowel(s.charAt(i))){
                arr[i]=vowelsStack.pop();
            }
        }

        return new String(arr);
    }

    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
}
