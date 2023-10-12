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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // i'm just trying to rewise the concepts of tree 
        //start from root and go down 
        // base condition 
        if(p==null && q==null ) return true;
        
        if((p==null && q!=null) || (p!=null && q==null) )
        {
            return false;
        }
        
        // now we have worked on the root node go to descendents 
        if(p.val != q.val)
        {
            return false;
        }
        
        return isSameTree(p.left , q.left) && isSameTree(p.right , q.right);
    }
}


// bas apne ko karna ye h ki current root node pe work karo sab kuch means sab kuch comarisons on null and
// values everything complete and eventually 
//return descendents for the recursion to handle 
