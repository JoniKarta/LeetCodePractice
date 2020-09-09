/**
	Problem: https://leetcode.com/problems/intersection-of-two-linked-lists/
 */

// The first solution uses two stacks, Time Complexity O(n + m), Space Complexity O(n + m) space
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        Deque<ListNode> stack1 = new ArrayDeque<>();
        Deque<ListNode> stack2 = new ArrayDeque<>();
        
        while(headA !=null){
            stack1.push(headA);
            headA = headA.next;
        }
        while(headB !=null){
            stack2.push(headB);
            headB= headB.next;
        }
        ListNode last = null;
        while(!stack1.isEmpty() && stack1.peek() == stack2.peek()){
            last = stack1.peek();
            stack1.pop();
            stack2.pop();
        }
        return last;
    }
}


// The second solution uses hashset Time Complexity O(n + m) Space Complexity and O(m)
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}


// The third solution uses 2 pointer, Time Complexity O(n), Space Complexity O(1) 
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA, q = headB;
        while (p != q) {
            p = (p != null) ? p.next : headB;
            q = (q != null) ? q.next : headA;
        }
        return p;
        
    }
}

