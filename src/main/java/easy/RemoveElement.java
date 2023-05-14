package easy;

import java.util.Stack;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        Stack<Integer> st = new Stack<Integer>();
        int k=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=val){
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
