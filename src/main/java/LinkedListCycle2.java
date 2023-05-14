import java.util.ArrayList;

public class LinkedListCycle2 {
	
	
	 // Definition for singly-linked list.
	  class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	  
	  
	  public ListNode detectCycle(ListNode head) {
	        
		  ArrayList<ListNode> list = new ArrayList<ListNode>();
		  
		  while(head!=null) {
			  
			  if(list.contains(head)) {
				  return head;
			  }
			  else {
				  list.add(head);
				  head=head.next;
			  }
		  }
		  return null;
	    }
}
