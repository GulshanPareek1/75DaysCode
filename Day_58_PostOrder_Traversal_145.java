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

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        //postorder traversal iterative
        LinkedList<Integer> ans = new LinkedList<Integer>();
        //List<Integer> ans = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack();
        if(root==null)
        {
            return ans;
        }
              
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode current = st.pop();
            ans.addFirst(current.val);
            //ans.add(0,current.val);
            
            if(current.left!=null)
            {
                st.push(current.left);
            }
            if(current.right!=null)
            {
                st.push(current.right);
            }
        }
        return ans;
    }
}
