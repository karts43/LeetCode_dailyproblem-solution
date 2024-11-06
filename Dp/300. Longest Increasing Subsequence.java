// T.c = O(n2) and S.c = O(n2)  with  Recursion + Memoization (Top down)
package LC_DP;
import java.util.*;
public class longest_incresing_subsequence {
   // step 1111
   public int [][] dp;
   // step 1112
   public int LIS(int []nums){
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
   public int solve(int current_index, int past_index, int[] nums) {
      //System.out.println(nums[current_index]);
      // step 30.0 --> true condition then exeuate
      if (current_index == nums.length)return 0;
      // step 30.1 ---> false condition then exeuate
      if (past_index != -1 && dp[current_index][past_index] != -1)return dp[current_index][past_index];
      // step 30.2
      int take = 0;
      // step 30.3 --> when either or condition arw true
      if(past_index == -1 || nums[past_index] <nums[current_index] ){
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
   
   public static void main (String[] a){
      longest_incresing_subsequence obj = new longest_incresing_subsequence();
      int []nums = {0,1,0,6,7,13,2,3};
      System.out.println(obj.LIS(nums));
      //obj.LSS(nums);
   }
}
