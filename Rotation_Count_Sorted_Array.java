package BinarySearch;

import java.util.Scanner;

public class Rotation_Count_Sorted_Array {
    //https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
    public static void main(String[] args) {
        int[] arr = {7 , 9 , 11 , 12 , 13 , 0};

        int pivot = pivotIndex(arr);
        System.out.println("this is pivot at index "+ pivot);
        if(pivot ==-1) {

            //return 0;
            // means here no rotation available ok
            System.out.println("means here no rotation available ok");
        }
        else
        {
            //return arr.length-pivot-1;
            System.out.println("This is Rotation Count "+ (pivot+1));
        }
    }

    static int pivotIndex(int[] arr)
    {
        int start = 0, end = arr.length-1 , mid;

        while(start < end)
        {
            mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[start]>=arr[mid])
            {
                end = mid-1;
            }
            else
            {
                //if(arr[start]<arr[mid])   this is the condition
                start = mid+1;
            }
        }

        // no pivot avalibale here
        return -1;
    }
}
