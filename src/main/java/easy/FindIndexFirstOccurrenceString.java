package easy;

public class FindIndexFirstOccurrenceString {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if (len < 2) {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    return i;
                }
            }
        } else {
            if (len > haystack.length()) {
                return -1;
            } else {
                for (int i = 0; i <= haystack.length() - len; i++) {
                    if (haystack.substring(i, i + len).equals(needle)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}