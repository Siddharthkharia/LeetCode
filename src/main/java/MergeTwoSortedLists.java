
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	//Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode res = new ListNode();
		ListNode temp = head; 

		while(true) {

			if(list1==null) {
				res.next=list2;
				break;
			}
			else {
				if(list2==null) {
					res.next=list1;
					break;
				}
				else {
					res.next = new ListNode();
					
					if(list1.val<=list2.val) {
						res.next.val=list1.val;
						list1=list1.next;
					}
					else {
						res.next.val=list2.val;
						list2=list2.next;
					}
					res=res.next;
				}
			}
		}
		return res.next;
	}

}
