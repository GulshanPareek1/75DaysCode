/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // great question 
        // uses 3 approaches basically which we have solved in previous 3 questions 
        // find the peak element first 
        // find in ascending array and 
        // find in descending array 
        
        // find the peak element 
        int peakIndex = Peak(target, mountainArr);
        
        // now we have peak index so before it the array is ascending and after it descending 
        // so find in ascending array using BS 
        
        int ansASC = BinarySearchASC(target ,  mountainArr , peakIndex);
        int ansDESC=0;
        // now find in the descending array after peak element 
        if(ansASC!=-1 )return ansASC;
        else
        {
            return BinarySearchDESC(target ,  mountainArr ,  peakIndex+1 );
        }
        
        
    }
    
    
    
    
    public int Peak(int target, MountainArray mountainArr)
    {
        // find the peak element 
        int start =0 , end = mountainArr.length()-1;
        int mid =0;
        
        while(start<end)
        {
            mid = start+(end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        
        return start;
    }
    
    public int BinarySearchASC(int target , MountainArray mountainArr , int peakIndex)
    {
        int start = 0, end = peakIndex , mid =0;
        
        while(start <= end)
        {
            mid = start + (end-start)/2;
            if(mountainArr.get(mid)>target)
            {
                end = mid-1;
            }
            else if(mountainArr.get(mid)<target)
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }
        }
        
        return -1;
    }
    
    public int BinarySearchDESC(int target , MountainArray mountainArr , int startIndex )
    {
        
        // this is desecding array and BS also for descending array 
        // just littile logic change and rest is same
        int start = startIndex;
        int end = mountainArr.length()-1 , mid =0;
        
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(mountainArr.get(mid)>target)
            {
                start = mid+1;
            }
            else if(mountainArr.get(mid)<target)
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

//eventually keep in mind the given restriction also which says don't call .get method so many times 
