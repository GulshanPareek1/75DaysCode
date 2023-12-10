// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null)
//         {
//             return 0;
//         }
        
//         int dia = depth(root.left)+depth(root.right);
//         int leftdia = diameterOfBinaryTree(root.left);
//         int rightdia = diameterOfBinaryTree(root.right);
        
//         return Math.max(dia , Math.max(leftdia,rightdia));
//     }
    
//     int depth(TreeNode root)
//     {
//         if(root==null)
//         {
//             return 0;
//         }
        
//         return 1+Math.max(depth(root.left),depth(root.right));
//     }
// }






public class Solution {
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
}
