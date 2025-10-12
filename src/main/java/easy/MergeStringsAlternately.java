package easy;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();
        for ( int i=0;i<len-1;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if(word1.length()<word2.length()){
            sb.append(word2.substring(len));
        }
        if(word1.length()>word2.length()){
            sb.append(word1.substring(len));
        }
        return sb.toString();
    }
}
