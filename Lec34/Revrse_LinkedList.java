package Lec34;


public class Revrse_LinkedList {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	class Solution {
	    public ListNode reverseList(ListNode head) {
	    	ListNode prev=null;
	    	ListNode  curr= head;
	    	while(curr!=null) {
	    		
	    		ListNode ahead=curr.next;
	    		curr.next=prev;
	    		prev=curr;
	    		curr=ahead;
	    	}
	    	return prev;
	        
	    }
	}
	
}
