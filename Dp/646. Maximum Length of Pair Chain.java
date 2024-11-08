class Solution {
     public int [][] dp;
   // step 1112
 public int findLongestChain(int[][] nums) {
    Arrays.sort(nums,(a,b)-> a[1]-b[1]);
      // step 1  // It's Dp consept use
      dp = new int[2501][2501];
      // step 2
      for(int []i:dp){
         // step 2.1
          Arrays.fill(i,-1);
      }
   // step 3 ---> call(30)
      return solve(0,-1,nums);
   }
   // step 30
   public int solve(int current_index, int past_index, int[][] nums) {
      // step 30.0 --> true condition then exeuate
      if (current_index == nums.length)return 0;
      // step 30.1 ---> false condition then exeuate
      if (past_index != -1 && dp[current_index][past_index] != -1)return dp[current_index][past_index];
      // step 30.2
      int take = 0;
      // step 30.3 --> when either or condition arw true
      if(past_index == -1 || nums[past_index][1] <nums[current_index][0] ){
         // step (30.2.1) --> 30.2 + call(30)
         take = 1 + solve(current_index+1,current_index,nums);
      }
      // step 30.4 ---> call(30)
      int skip = solve(current_index+1,past_index,nums);
      // step 30.5 
      if (past_index != -1) {
         // step (30.5.1) ---> 1111 = max((30.4) or(30.2.1))
          dp[current_index][past_index] = Math.max(skip, take);
      }
      // step 30.6 -----> max((30.4) or(30.2.1))
      return Math.max(skip, take);
  }
}
