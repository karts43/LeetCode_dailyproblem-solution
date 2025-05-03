// T.c = O(n) and  S.c = O(1)
class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i =0 ;i<n; i++){
          // 🔍 Checks 2/4/6 digit numbers
            if(nums[i]>9 && nums[i]<100 || nums[i]>999 && nums[i]<10000 || nums[i]==100000){
                count++;
            }
        }
        return count;
    }
}
