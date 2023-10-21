// nice explanation 
// if you got stucked or unable to understand the solution go refer this video(https://www.youtube.com/watch?v=Gl-8HLvV8bc)

class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans =0 , i=0,j=0;
        int n = nums.length;
        while(j<n)
        {
            if(nums[j]==0)
            {
                k--;
            }
            while(k<0)
            {
                if(nums[i]==0)
                {
                    k++;
                }
                i++;
            }
            
//             j++;
//             ans = Math.max(ans , j-i);   // by mistake shi ho gaya see and find how 
            ans = Math.max(ans , j-i+1);
            j++;
        }
        
        return ans;
    }
}
