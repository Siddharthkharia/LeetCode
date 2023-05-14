import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AllElementsinTwoBinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	 // Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }

	class Solution {
	    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
	        List<Integer> res = new ArrayList<Integer>();
	        
	        checker(root1,res);
	        checker(root2,res);
	        Collections.sort(res);
	        
	        return res;
	        
	    }
	    
	    public  void checker(TreeNode root, List<Integer> l) {
	    	
	    	if(root!=null) {
	    		l.add(root.val);
	    		checker(root.left,l);
	    		checker(root.right,l);
	    	}
	    	
	    	
	    }
	}

}
