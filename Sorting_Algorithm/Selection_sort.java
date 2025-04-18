
//*************************** Java ********************
//  t.c = O(n2)  and  s.c = O(1)
import java.util.*;
class Selection_sort{
   // step 1005: Define the selection sort function
public static int[] selection(int [] nums){
   // step 1005.0: array length
int n = nums.length;
   // step 1005.1  Loop through the array from index 0 to n-2 
   for(int i = 0;i<= n-2 ;i++){
      // step 1005.1.0 Assume the minimum is at index i
      int min = i;
      // step 1005.1.1: Find the actual minimum element's index in the unsorted part
      for(int j = i;j<=n-1;j++){
         // step 1005.1.1.0: If a smaller element is found, update min
         //  (check(j small than i --> it true then step 1005.1.1.0.1 either false execute // step 1005.1))
         if(nums[j] < nums[min]){
            // step 1005.1.1.0.1 --> it true then swaping(i,j)
            min = j;
         }
      }
      // Step 1005.1.2: Swap the minimum element with the element at index i
         int temp = nums[i];
         nums[i] = nums[min];
         nums[min] = temp;
   }
   // step 1005.2: finaly return integer array ehich are sorted manner / ascending order
   return nums;
}
public static void main(String[] args){
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
   // it optional array defind
   //int [] nums = {13,46,28,52,20,9};

// step 1005: print answer in integer arrya to string format
   System.out.println(Arrays.toString(selection(nums)));
}
}


//************************** Python ********************
def selec(nums):
   sizee = len(nums)
   for i in range(sizee-1):
      minimun_num = i
      for j in range(i,sizee):
         if nums[j] < nums[minimun_num]:
            minimun_num = j
      
      temp = nums[i]
      nums[i] = nums[minimun_num]
      nums[minimun_num] = temp
   return nums

sizeofarray = int(input())
nums = []
for i in range(sizeofarray):
   nums.append(int(input()))

print(selec(nums))

