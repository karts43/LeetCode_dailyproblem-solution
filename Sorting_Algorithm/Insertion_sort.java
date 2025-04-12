// T.c = O(n2) and S.c = O(1)
import java.util.*;

public class lnserction_sort {
   public static int [] inser(int[] nums){
      int n = nums.length;
      for(int i =1 ;i<= n-1 ;i++){
         int key = nums[i];
         int j;
         for ( j = i-1; j >= 0 && nums[j] > key; j--) {
               nums[j + 1] = nums[j];
         }
         nums[j + 1] = key; 
      }
      return nums;
   }

   public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int sizee = in.nextInt();
          int [] nums = new int[sizee];
          for(int i = 0 ;i<sizee ;i++){
         nums[i] = in.nextInt();
         }
         System.out.println(Arrays.toString(inser(nums)));
         // Optional predefined array
         //int [] nums = {13,46,28,52,20,9};
   }
}
