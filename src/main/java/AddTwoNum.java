

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
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		int carry =0;

		while(l1!=null || l2!=null || carry>=1){
			int sum=0;
			if(l1!=null){
				sum=sum+ l1.val;
				l1=l1.next;
			}
			if(l2!=null){
				sum=sum+l2.val;
				l2=l2.next;
			}
			sum=sum+carry;

			carry=sum/10;

			ListNode node = new ListNode(sum%10);
			curr.next=node;
			curr = curr.next;
		}
		return dummy.next;
	}

	public ListNode createNode(String number){
		ListNode l = new ListNode();
		int len=number.length();
		if(len==0){
			return null;
		}else{
			if(len==1){
				int parseInt = number.charAt(0);
				l.val = parseInt;
				return l;
			}else{
				int parseInt = number.charAt(0);
				l.val = parseInt;
				l.next = createNode(number.substring(1,number.length()-1));
				return l;
			}
		}
	}

	public static int createNum(ListNode listNode){
		int num=0;
		if (listNode.next!=null){
			num=num*10+listNode.val;
			createNum(listNode.next);
			return num;
		}else{
			return listNode.val;
		}
	}
}
