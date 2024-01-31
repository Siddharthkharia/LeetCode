package easy;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        return arr[arr.length-1].length();
    }

    public int len(String s){
        s.trim();
        String arr[] = s.split(" ");

        int positionOfTheLastWord = arr.length;
        System.out.println("The last word is :- "+ arr[positionOfTheLastWord-1]);

        System.out.println("The length of the last word is :- "+ arr[positionOfTheLastWord-1].length());

        return arr[positionOfTheLastWord-1].length();
    }



}


