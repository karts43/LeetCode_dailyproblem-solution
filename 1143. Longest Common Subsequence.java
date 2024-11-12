 // T.c = O(m*n) and S.c = O(m*n)
class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        //int [][] bottom_up = new int[1000+1][1000+1];
        int [][] bottom_up = new int[m+1][n+1];
      // initial row and col are assing zero(0)
      /*        0  1  2  3 .. n+1_              _
          0   | 0  0  0  0 .. 0  |
          1   | 0  _  _  _ .. _  |
          2   | 0  _  _  _ .. _  |
          3   | 0  _  _  _ .. _  |
          :   | .. .  .  . .. .  |
          m+1 | 0  _  _  _ .. _  | 
      */
        for(int row = 0 ; row<m+1 ; row++){
            bottom_up [row][0] = 0;
        }
        for(int col = 0 ; col<n+1 ;col++){
            bottom_up [0][col] = 0;
        }
       // find condition check  below block
        for(int  i = 1 ; i<m+1 ; i++){
            for(int j =1 ; j<n+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                bottom_up[i][j] = 1 + bottom_up[i-1][j-1];
                }else{
                bottom_up[i][j] = Math.max(bottom_up[i-1][j],bottom_up[i][j-1]);
                 }
            }
        }
        // check matrix form
     /* 
      for(int  i = 0 ; i<=m ; i++){
         for(int j =0 ; j<=n;j++){
          System.out.println(bottom_up[i][j]);
          }
      System.out.println();
      }
      */
      // answer are present last position bottom_up[m][n] 
        return bottom_up[m][n];
    }
}
