/**
 Problem: https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode temp = root;
        while(temp != null || !s.isEmpty()){           
            if(temp != null){
                s.push(temp);
                temp = temp.left;
            }else{
                temp = s.pop(); 
                inorder.add(temp.val);
                temp = temp.right;
            }
        }
        return inorder;
    }
}
