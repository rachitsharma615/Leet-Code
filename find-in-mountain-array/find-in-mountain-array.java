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
            System.out.println(mountainArr.length());
    
    //first, we have to find out the peak of the mountain array
    
    int peak = func_peak(mountainArr);
    
    /* Next, we will find out the target (using binary search) in first side of the array                (ascending) */
    
    if(asc(target, mountainArr, peak) != -1)
    {
        System.out.println("asc" + asc(target, mountainArr, peak));
        return asc(target, mountainArr, peak);
    }
    else
    {
        //When not found in ascending order, we will go to the descending order part
        
        return desc(target, mountainArr, peak);
    }
    
}

public int func_peak(MountainArray mountainArr)
{
    int start = 0;
    int end = mountainArr.length() -1;
    
    while(start<end)
    {
        int mid = start + (end-start)/2;
        
        if(mountainArr.get(mid) > mountainArr.get(mid+1))
        {
            end = mid;
        }
        else
        {
            start = mid + 1;
        }
    }
    
    return start;
}

public int asc(int target, MountainArray mountainArr, int peak)
{
    int start = 0;
    int end = peak;
    
     while(start<=end)
     {
         int mid = start + (end-start)/2;
         
         if(target < mountainArr.get(mid))
         {
             end = mid - 1;
         }
         else if(target > mountainArr.get(mid))
         {
             start = mid + 1;
         }
         else
         {
             return mid;
         }
     }
    
    return -1;
}

 public int desc(int target, MountainArray mountainArr, int peak)
{
    int start = peak+1;    //so that the whole [] array we get is sorted
    int end =  mountainArr.length() - 1;
    
     while(start<=end)
     {
         int mid = start + (end-start)/2;
         
         if(target > mountainArr.get(mid))
         {
             end = mid - 1;
         }
         else if(target < mountainArr.get(mid))
         {
             start = mid + 1;
         }
         else
         {
             return mid;
         }
     }
    
    return -1;

    }
}