/**
	 Problem: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
class Solution {
    public int binaryToDecimal(String binary){
        int decimal = 0;
        int exp = 0;
        for(int i = binary.length() - 1; i >= 0; i--)
            decimal = decimal + (binary.charAt(i) - '0') * (int)Math.pow(2,exp++);
        
        return decimal;
    }
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head != null){
            sb.append(head.val);
            head = head.next;
        }
        return binaryToDecimal(sb.toString());
    }
}
