package medium;

public class ReverseWordsString {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        int numberOfWords = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i = numberOfWords-1;i>=0;i--){
            if(!arr[i].contains(" ")){
                sb.append(arr[i].trim());
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
