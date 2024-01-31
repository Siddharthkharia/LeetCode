package easy;

import java.util.Collections;
import java.util.Stack;

public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();
        int k=0;
        for(int i=0; i<nums.length;i++){
            if(!(st.contains(nums[i]))){
                st.push(nums[i]);
            }
        }
        for(int i=0;i< st.size();i++){
            nums[i]=st.elementAt(i);
        }
        k =st.size();
    return k;
    }
}
