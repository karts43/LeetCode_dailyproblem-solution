// T.c = O(n) & S.c = O(1)
class Solution {
     public int findTheWinner(int n, int k) {   
      int index = findnumwinner(n , k);
    //  System.out.println("1.method for index = "+index);
      return index+1;       
   }
   private int findnumwinner(int n, int k) {
      if(n==1)return 0;
      int value = findnumwinner(n-1, k);
    //  System.out.println("2.1.method for reurion call value = "+value);
      value = (value + k ) % n ;
    //  System.out.println("2.2 method for modulo value  = "+value);
      return value;
   }
}
