class Solution {
    public int[] searchRange(int[] nums, int target) {
        
    int[] ans={-1,-1};
    ans[0] = BinarySearch(nums, target, true);
     if (ans[0] != -1) {
            ans[1] = BinarySearch(nums, target, false);
        }     
    return ans;
    }
    
    int BinarySearch(int[] nums,int target, boolean startOcc)
    {
       int ans=-1;
       int left=0;
       int right=nums.length-1;
   
       while(left<=right)
       {
        int mid=left+(right-left)/2;
        
        if(target<nums[mid])
        {
            right=mid-1;
        }
        else if(target>nums[mid])
        {
            left=mid+1;
        }
        else
        {
            ans=mid;
            if(startOcc)
            {
                
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
    }
        return ans;
    }
}