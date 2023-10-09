class Solution {
    public int findPeakElement(int[] nums) {
        int start=0,end = nums.length-1 , mid=0;
        
        while(start<end)
        {
            mid = start+(end-start)/2;
            if(nums[mid]<nums[mid+1])
            {
                start = mid+1;
            }
            else if(nums[mid]>nums[mid+1])
            {
                end = mid;
            }
        }
        
        return start;
    }
}
// class Solution {
//     public int findPeakElement(int[] nums) {
//         int start =0, end = nums.length-1 , mid=0;
        
//         while(start<end)
//         {
//             mid = start+ (end-start)/2;
//             if(nums[mid]<nums[mid+1])
//             {
//                 start = mid+1;
//             }
//             else if(nums[mid]<nums[mid-1])
//             {
//                 end = mid;
//             }
//             else
//                 return mid;
//         }
        
//         return -1;
//     }
// }
// this approach by me is not working so here 
// learning is that alwas compare with same parameter like (mid+1) or (mid-1) 
//any one of them for comparing 
