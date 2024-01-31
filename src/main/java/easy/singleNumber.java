package easy;

import java.util.*;
import java.util.stream.Collectors;

public class singleNumber {

    public static void main(String [] args){

        int [] arr = {1};

        System.out.println(singleNumberSorted(arr));
    }

    public static int singleNumber(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                list.remove(list.lastIndexOf(arr[i]));
            }else{
                list.add(arr[i]);
            }
        }
        return list.get(0);
    }

    public static int singleNumberSorted(int[] nums){
        List<Integer> list = Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toList());
        Collections.sort(list);
        System.out.println("sorted list :- " + list);

        List<Integer> set = new ArrayList<Integer>();

        for(int i=0;i<list.size();i++){

            if(!set.contains(list.get(i))){
                System.out.println("set doesn't contain :- "+ list.get(i));
                if (set.size()==1){
                    System.out.println("\tset size already greater than 1 contains value :- "+ set.get(0));
                    return set.get(0);
                }
                System.out.println("\tset size 0 adding value :- "+ list.get(i));
                set.add(list.get(i));
            }else{
                System.out.println("set already contains value, removing same value from set :- "+ list.get(i));
                set.remove(list.get(i));
            }
        }
        return set.get(0);
    }
}
