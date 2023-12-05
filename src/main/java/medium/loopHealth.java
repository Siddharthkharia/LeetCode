package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class loopHealth {

    public static void main(String[] args){

        Integer[] inputArray = {9,7,21,23,15,17,19,4,6,8};
//        outPutArray = [[23,21], [7,9], [6,8], ..]

        List<Integer[]> op = new ArrayList<Integer[]>();

int key=0;
        List<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<inputArray.length;i++){
            li.add(inputArray[i]);
        }
        Collections.sort(li);
        for(int i=0;i< li.size();i++){
          key=li.get(i);
          if(li.contains(key+2)){
              List<Integer> sub = new ArrayList<Integer>();
              sub.add(li.get(i));
              sub.add(li.get(i)+2);
              op.add((Integer[]) sub.toArray());
          }
        }
        System.out.println(op);
    }
}
