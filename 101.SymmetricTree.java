/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // here we need to compare two nodes so make helper function
        // understand the mirror approach first on pen paper
        return (root==null || Helper(root.left , root.right));
    }
                
    public boolean Helper(TreeNode Left , TreeNode Right)
                {
                    // start from downwards 
                    if(Left==null && Right==null)
                    {
                        return true;
                    }
                    if((Left!=null && Right==null)||(Left==null && Right!=null))
                    {
                        return false;
                    }
                    // check for the values of left and right then move ahead 
                    // don't forget the present 
                    if(Left.val == Right.val)
                    {
                       return Helper(Left.left , Right.right) && Helper(Left.right , Right.left);    
                    }
                    
                    // covered all base cases now 
                    // go for recursive call
                    return false;
                }
}
