/**
	Problem https://leetcode.com/problems/maximum-binary-tree/
 */
class Solution {
    public int findMax(int left, int right, int[] nums){
        int index = left;
        for(int i = left; i <= right; i++){
            if(nums[i] > nums[index]){
                index = i;
            }
        }
        return index;
    }
    public TreeNode constructHelper(int left, int right, int[] nums){
         if(left > right){
             return null;
         }
        
        int maxIdx = findMax(left, right, nums);
        TreeNode root = new TreeNode(nums[maxIdx]);
        root.left = constructHelper(left, maxIdx - 1, nums);
        root.right = constructHelper(maxIdx + 1, right, nums);
        
        return root;
        
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructHelper(0,nums.length - 1, nums);
        
    }
    
}


class Solution {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        Deque<TreeNode> stack = new ArrayDeque<>();
        for(Integer num : nums){
            
            TreeNode current = new TreeNode(num);
            
            // If the element in stack is less then the current element then set him as his left child.
            while(!stack.isEmpty() && current.val > stack.peek().val){
                current.left = stack.pop();
            }
            
            // If the stack is not empty and the current element is less then the element at the top of the stack
            if(!stack.isEmpty()){
                stack.peek().right = current;
            }
            stack.push(current);
        }
    return stack.peekLast();
    }
    
}
