class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> ans = new  ArrayList<Integer>();

        //retrival(root);
        if(root == null) 
           return ans;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        //TreeNode node = root;
        while(!st.isEmpty())
        {
            TreeNode current = st.pop();
            ans.add(current.val);
            
            if(current.right!=null)
            {
                st.push(current.right);
            }
            
            if(current.left!=null)
            {
                st.push(current.left);
            }
            
        }
          
        return ans;
    }
   
    
//     public void retrival(TreeNode root)
//     {
//         if(root==null)
//         {
//             return;
//         }
//         ans.add(root.val);
        
//         retrival(root.left);
//         retrival(root.right);
//     }
}
