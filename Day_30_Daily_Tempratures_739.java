class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n =temperatures.length;
        int[] ans = new int[n];
        
        Stack<Integer> st = new Stack();
        
        for(int i=n-1;i>=0;i--)
        {
            // warmer day means temp should be more than last day 
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i])
            {
                st.pop();
            }
            
            if(st.isEmpty())
            {
                ans[i]=0;
            }
            else
            {
                ans[i]=st.peek()-i;
            }
            
            st.push(i);
        }
        
        return ans;
    }
}