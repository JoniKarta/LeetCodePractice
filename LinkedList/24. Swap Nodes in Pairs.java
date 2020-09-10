/**
	Problem: https://leetcode.com/problems/swap-nodes-in-pairs/
*/
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;  
        ListNode p = swapPairs(head.next.next);          
        ListNode r = head.next;
        r.next = head;
        head.next = p;
        return r; 
    }
}
