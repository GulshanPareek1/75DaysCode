// easy and simple just write over notebook and try to solve and code .... EASY 

class Solution {
    public int maxDepth(TreeNode root) {
    if(root==null)
    {
        return 0;
    }
        
        return 1+Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
}
