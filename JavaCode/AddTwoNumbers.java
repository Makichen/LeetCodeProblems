class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    		ListNode newHead = new ListNode(0);
    		ListNode p = l1;
    		ListNode q = l2;
    		ListNode currentNode = newHead;
    		int carry = 0;
    		
    		while(p!=null || q!=null) {
    			int num1 = (p!=null) ? p.val: 0 ;
    			int num2 = (q!=null) ? q.val: 0 ;
    			int result = (carry+num1+num2) % 10;
    			carry = (num1+num2+carry) / 10;
    			currentNode.next = new ListNode(result);
    			currentNode = currentNode.next;
    			
    			if(p!=null) p = p.next;
    			if(q!=null) q = q.next;
    		}
    		
    		if(carry == 1) {
    			currentNode.next = new ListNode(1);
    		}
    		
        return newHead.next;
    }
}
