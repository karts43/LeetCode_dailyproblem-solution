// 2149. Rearrange Array Elements by Sign

// Runtime: 3 ms, faster than 100.00% of Java online submissions for Rearrange Array Elements by Sign.
// Time Complexity : O(n) 
// Space Complexity : O(n) 
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] Answer = new int[n];
    //    if(n%2==0){                 // if check size of given Array  is Even 
        int  Pi = 0 , Ni = 1 ;
            for(int i = 0 ; i < n ; i++){
                if(nums[i] > 0){
                    Answer[Pi]= nums[i];
                    Pi+=2;    
                }else{
                    Answer[Ni]= nums[i];
                    Ni+=2;
                }
            }
      //  }
        return Answer ;
    }
}
