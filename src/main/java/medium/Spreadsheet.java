package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Spreadsheet {

    private Map<String,Integer[]> sheet;
    public Spreadsheet(int rows) {
        this.sheet = new HashMap<>();

        for (int i=0;i<26;i++){
            char col = (char) ('A' + i);
            String key = String.valueOf(col);
            this.sheet.putIfAbsent(key,new Integer[rows]);
            Arrays.fill(this.sheet.get(key),0);
        }
    }

    public void setCell(String cell, int value) {

        String key = String.valueOf(cell.charAt(0));

        int index = Integer.parseInt(cell.substring(1));
        this.sheet.get(key)[index] = value;
    }

    public void resetCell(String cell) {
        String key = String.valueOf(cell.charAt(0));
        int index = Integer.parseInt(cell.substring(1));
        this.sheet.get(key)[index] = 0;
    }

    public int getValue(String formula) {
        int indexPlus = formula.indexOf('+');

        String left = formula.substring(1,indexPlus);
        String right = formula.substring(indexPlus+1);

        int valLeft = Character.isLetter(left.charAt(0)) ? this.sheet.get(String.valueOf(left.charAt(0)))[Integer.parseInt(left.substring(1))]: Integer.parseInt(left);
        int valright = Character.isLetter(right.charAt(0)) ? this.sheet.get(String.valueOf(right.charAt(0)))[Integer.parseInt(right.substring(1))]: Integer.parseInt(right);

        return valLeft + valright;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */