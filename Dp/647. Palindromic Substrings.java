// T.c = O(n^2) and S.c = O(n^2)
class Solution {
    // step 1111 is initial / starting
    public int countSubstrings(String s) {
        // step 1 : define size 
        int size_s = s.length();
        // step 2 : final count variable
        int count_of_sub_string = 0;
        // step 3 : we use or create  2d Arrray at size m*m
        int [][]dp =new int[size_s][size_s];
        // step 4 : 2d array are initial define -1
        for(int []i:dp){
            // step 4.0 : for ecah i index of array  define -1
            Arrays.fill(i,-1);
        }
        // step 5 : index i stating  check is palindrom
        for(int i=0;i<size_s;i++){
            // step 5.1 : 
            for(int j=i;j<size_s;j++){
                // step 5.1.1 : check a is palindrom at call ( step 511 )
                if(check_is_palindrom(i,j,s,dp)){
                    // step 5.1.1.(2): it condition are true then step 2 are increment by +1
                    count_of_sub_string +=1;
                }
            }
        } 
        // step 6 : final answer are return step 2.
        return count_of_sub_string;
    }
    // step 511
    public boolean check_is_palindrom(int i,int j,String s,int [][]dp){
        // step 511.1 : check (i>=j) condition then return true we consider is palindrom
        if(i>=j)return true;
        // step 511.2 : check all ready find answer at [i][j] index
        if(dp[i][j] != -1)return dp[i][j] == 1;
        // step 511.3 : check i & j index at string s are same then run below block
        if(s.charAt(i) == s.charAt(j)){
            // step 511.3.1 : call (511) check i+1 & j-1 index at string s are same  or not same 
           boolean value = check_is_palindrom(i+1,j-1,s,dp);
           // step 511.3.2  : check conditio are true
           if(value == true){
            // step 511.3.2.1  :then step 511.3.1 are true that time (i+1 & j-1)index at dp fill value =1 (i.e file true)
            dp[i][j] = 1;
           }else{
            // step 511.3.2.1  :then step 511.3.1 are false that time (i+1 & j-1)index at dparray fill value=fales (i.e file false)
            dp[i][j] = 0;
           }
           return value;
        }
        dp[i][j]=0;
        return false;
    }
}
