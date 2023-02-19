// // Time Complexity: O(N2)

// // Space Complexity: O(1)





// public class Apairwithgivensumexistin{
//     public static void main(String args[]){
// int number[] = {2,7,11,15};
//         int target = 17;
// TargetSum(target , number);
// }
// public static void TargetSum(int target , int number[]) {

 // for(int i = 0 ; i<=number.length-1 ; i++){
// for(int j = i+1 ; j<=number.length-1 ; j++){
// if(number[i] + number[j] == target){
//     System.out.println("the target sum is the sum of  " + i + " , " + j + " pair");
// return;
// }
// }
// System.out.println();
// }   
// }

//     
// }




// uses a while loop and sorting, is O(nlogn) because the sort() function has a time complexity of O(nlogn). The while loop takes O(n) time on average to find the two elements that add up to the target.

// So, the overall time complexity of the code is O(nlogn + n) = O(nlogn). This means that the time it takes for the code to run increases linearly with the size of the input array, and the sorting operation contributes the most to the time complexity.

// Solution 2: Two-Pointer Approach

// Think about, what if the array is sorted? If the array is sorted, is it possible to reach a sum by traversing the array from both sides simultaneously?


// import java.util.Arrays;
// import java.util.List;
// import java.util.ArrayList;
// import java.util.*;

// public class Apairwithgivensumexistin {
//     public static void twoSum(int[] nums, int target) {
      
          
//       Arrays.sort(nums);
//       for(int i = 0 ; i<nums.length ; i++){
//           System.out.print(nums[i] + " ");
        
//       }
//       System.out.println();
// // so if array is not sorted then sort it first 

//       int left = 0;
//       int right = nums.length - 1;
//       int n1 = 0, n2 = 0;

//       while (left < right) {
//           if (nums[left] + nums[right] == target) {
//               n1 = left;
//               n2 = right;
//               break;
//               //so if the left + right value is > target it means as our array is sorted in right side we have greate value so we have to found the index which have less value so right--
//           } else if (nums[left] +nums[right] > target) {
//               right--;
//           } else {
//               left++;
//           }
//       }

//      System.out.println(n1 + " " + n2);




       
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 1 , 5, 7, 11, 15};
// // int[] nums = {1 ,2 , 3 , 5 , 7 , 11 , 15};
//         int target = 17;
//  twoSum(nums, target);

//     }
// }


import java.util.*;

public class Apairwithgivensumexistin {
   
    public static int[] twoSum(int[] nums, int target) {
      int[] result = new int[2];//    // #to store the index array is created
      Map<Integer, Integer> map = new HashMap<Integer , Integer>();
      for(int i = 0 ; i<nums.length; i++){
        if(map.containsKey(target - nums[i])){
            result[1] = i;
            result[0] = map.get(target - nums[i]);//just inserting the value in arr[0] here i am passing key and as a result ii am stroing index of the number map.get means to get the value(index in theis case) thorugh the target - num[i] value ok if the targe - num[i] value is in hashmap then i is  one index and current i is one index
            return result;
        }
        map.put(nums[i] , i);
      }
      return result;
    }
    public static void main(String[] args) {
        int[] nums = {2 ,6 , 5 ,8 ,11};
        int target = 14;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + " " + result[1]);
    }
}





