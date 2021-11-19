
   class Solution {
    public int findKthPositive(int[] arr, int k) {
        int prev = 0;
        for (int i =0; i<arr.length; i++) {
            while (prev+1 != arr[i]) {
                prev++;
                 k--;
                 if (k==0)
                    return prev;
            }
            
            if (prev+1 == arr[i])
                prev = arr[i];
        }
        
        return arr[arr.length-1]+k;
    }
}
