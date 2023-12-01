// first solved using recursive method now 
// solve using iterative method 
class Solution {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        //postorder traversal 
    
        triversal(root);        
        return ans;
    }
    
    public void triversal(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        
        
        triversal(root.left);
        triversal(root.right);
        ans.add(root.val);
        
    }
}
