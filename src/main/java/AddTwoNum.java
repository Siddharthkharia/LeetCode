

/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 */



public class AddTwoNum {


	//  Definition for singly-linked list.

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}


	public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		int carry=0;

		while(l1!=null || l2!=null) {

			int num1=((l1!=null)?l1.val:0);
			int num2=((l2!=null)?l2.val:0);
			int sum=num1+num2+carry;

			carry=sum/10;

			l3.next = new ListNode(sum%10);
			l3=l3.next;
		}

		if(carry>0) {
			l3.next = new ListNode(carry);
		}

		return l3.next;
	}
}
