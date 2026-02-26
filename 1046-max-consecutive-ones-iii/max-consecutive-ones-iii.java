class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int i = 0 , j = 0 , curr_Sum = 0 , ans = 0 , n = nums.length ;
        int ZeroCount = 0 ;
        for(int a = 0 ; a < n ; a++)
        {
            if(nums[a] == 0)
            {
                ZeroCount++ ;
            }
        }
        if(ZeroCount < k) return n ;
        while(j<n)
        {
            curr_Sum += nums[j] ;
            if(j-i+1 - curr_Sum > k)
            {
                curr_Sum -= nums[i] ;
                i++ ;
            }
            else if(j-i+1 - curr_Sum == k)
            {  
                ans = Math.max(ans,j-i+1) ;
            }
            j++ ;
        }
        return ans ;
    }
}
