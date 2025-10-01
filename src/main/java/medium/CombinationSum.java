package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationSum {

    public List<List<Integer>> combinationSum_BruteForce(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numbers = Arrays.stream(candidates).boxed().collect(Collectors.toList());
        Collections.sort(numbers);
        for(int i=0;i<numbers.size();i++){

            List<Integer> temp = new ArrayList<>();
            if(target== numbers.get(i)){
                result.add(new ArrayList<>(numbers.get(i)));
                break;
            }

            int compliment = target-numbers.get(i);

            if(numbers.contains(compliment)){
                temp.add(numbers.get(i));
                temp.add(compliment);
                result.add(temp);
            }else{
                for(int n : numbers){
                    if(compliment%n==0){
                        int count =1;
                        while(count<compliment/2){
                            temp.add(n);
                        }
                        temp.add(numbers.get(i));
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        makeCombo(candidates,target,0,0,new ArrayList<Integer>(),result);
        return result;
    }

    public void makeCombo(int[] candidates,int target, int index, int total,  List<Integer> current, List<List<Integer>> result){
        if(target==total){
            result.add(new ArrayList<>(current));
            return;
        }

        if(total>target || index>= candidates.length){
            return;
        }

        current.add(candidates[index]);
        makeCombo(candidates,target,index,total+candidates[index],current,result);
        current.remove(current.size()-1);
        makeCombo(candidates,target,index+1,total,current,result);
    }

}
