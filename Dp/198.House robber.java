// T.c = O(n) 
// S.c = O(1)
class Solution {
  // step 111
    public int rob(int[] nums) {
      // step 1
        int [] dp = new int[101];
      // step 2
        Arrays.fill(dp,-1);
      // step final call(111.3)
        return solve(nums,0,dp);
    }
  // step 111.3
    public int solve(int []nums,int i,int []dp){
      // step 3.0
        if(i>=nums.length)return 0;
      // step 3.1
        if(dp[i] != -1)return dp[i];
      // step 3->111.3
        int stile = nums[i] + solve(nums,i+2,dp);
       // step 4->111.3
        int not_stile = solve(nums,i+1,dp);
       // step 5-> (3 or 4) ->111.1
        return dp[i]=Math.max(stile,not_stile);
    }
}
