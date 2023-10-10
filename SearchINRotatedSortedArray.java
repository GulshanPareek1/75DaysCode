class Solution {
    public int search(int[] nums, int target) {
        // here we can use simple approach 
        // first find peak and then search in both the arrays 
        /// ** not peak it pivot element find pivot element 
        //if(target == nums[peak]) return peak;
        int pivot = PivotIndex(nums , 0 , nums.length-1);
        //System.out.println("Value of peak is"+peak);
        // after pivot index just find in both the arrays the target element s 
        
        int firstArray = BinarySearch(nums , target , 0 , pivot);
        
        if(firstArray!=-1) return firstArray;
        else {
            return BinarySearch(nums, target , pivot+1 , nums.length-1);
        }
    }
    
    int PivotIndex(int[] nums , int start , int end)
    {
        int mid = 0;
        
        while(start<end)
        {
            mid = start + (end -start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            else if(nums[mid]>=nums[start])
            {
                start = mid+1;
            }
            else if(nums[mid]<nums[start])
            {
                end = mid-1;
            }
            
        }
        System.out.println("Value of peak is"+start +" "+end);
        return -1;
    }
    
    int BinarySearch (int[] nums ,int target, int start , int end)
    {
        int mid=0;
        
        while(start <= end)
        {
            mid = start + (end -start)/2;
            if(nums[mid]<target)
            {
                start = mid+1;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
