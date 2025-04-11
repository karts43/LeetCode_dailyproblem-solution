/* T.c = O(n²) (Every element must be compared and swapped maximum work) and S.C = O(1) (Constant) */
import java.util.*;

public class Bubble_sort {
   // step 1005: Define the Bubble sort function
   public static int[] bubble(int[] nums){
      // step 1005.0 : define array size
      int n = nums.length;
      // step 1005.1 : iterate loop in last number to 0th index
      for(int i = n-1; i>=1 ;i--){
         // step 1005.1.0 : iterate loop 0th index to i-1 index
         for(int j = 0; j<=i-1;j++){
            // step 1005.1.0.0: If a Bigger element is found,Perform the swap( j , j+1)index
            //  (check(j small than j+1 --> it true then step step 1005.1.0.0.0 either false execute // step 1005.1.0 increment index j++))
            if(nums[j]>nums[j+1]){
               // step 1005.1.0.0.0 --> it true then swaping(i,j)
               int temp = nums[j];
               nums[j] = nums[j+1];
               nums[j+1] = temp;
               //System.out.println(Arrays.toString(nums));
            }
         }
      }
      // step 1005.2: finaly return integer array ehich are sorted manner / ascending order
      return nums;
   }
   public static void main(String[] args) {
         // step 1001 --> create input object (i.e in)
         Scanner in = new Scanner(System.in);
         // step 1002 --> Take input for the size of the array
         int sizee = in.nextInt();
         // step 1003: define array
          int [] nums = new int[sizee];
         // step 1004: Take array input from user
          for(int i = 0 ;i<sizee ;i++){
         // Step 1004.1: Store each element
         nums[i] = in.nextInt();
         }  
         // step 1005: print answer in integer arrya to string format
         System.out.println(Arrays.toString(bubble(nums)));
         // Optional predefined array
         //int [] nums = {13,46,28,52,20,9};
      // }catch (Exception e) {
            // TODO: handle exception
         //   System.out.println("hello");
       //}
   }
}
