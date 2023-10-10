package BinarySearch;
public class InfiniteBS_gfg{
    public static void main(String[]args)
    {
        int[] arr = {2 , 4 , 6, 8 , 9 , 10 , 34 ,  35 , 56 , 67 , 89 , 91 , 99 , 101 , 104 , 204 , 432 , 674, 765, 987,  1004 , 1005 , 1006 , 1007 , 1011 , 1021 , 2000, 3000 , 4000 , 5000};
        int target = 91;
        int anss = ans(arr , target);
        System.out.println("here the index for target is "+anss);
        
    }
    public static int ans(int[] arr , int target)
    {
        int start=0;
        int end = 1;

        while(target>arr[end])
        {
            int newStart = end+1;

            end = end + (end-start+1)*2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr , int target , int start , int end )
    {
        //int start =0, end = arr.length ;
        int mid =0;

        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(arr[mid]<target)
            {
                start = mid+1;
            }
            else if(arr[mid]>target)
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
