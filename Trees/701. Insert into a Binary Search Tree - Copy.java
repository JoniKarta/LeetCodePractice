/**
	Problem: https://leetcode.com/problems/insert-into-a-binary-search-tree/
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root == null)
            return newNode;
        
        TreeNode t = root, r = null;
        
        while(t != null){
            r = t;
            if(val > t.val){   
                t = t.right;
            }else {             
                t = t.left;
            }
        }
                
        if(val < r.val){
            r.left = newNode;
        }else{
            r.right = newNode;
        }
        return root;
    }
}
