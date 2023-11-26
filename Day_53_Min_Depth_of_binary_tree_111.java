// i've done max depth of tree 
// this is dfs solution 
class Solution {
    public int minDepth(TreeNode root) {
        //int mini = Integer.MAX_VALUE;
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        if(root.left==null)
        {
            return 1+minDepth(root.right);
        }
        if(root.right==null)
        {
            return 1+minDepth(root.left);
        }
        
        return 1+Math.min(minDepth(root.left) , minDepth(root.right));
    }
}
