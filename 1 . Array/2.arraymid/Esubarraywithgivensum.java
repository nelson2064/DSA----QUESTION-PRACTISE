

// import java.util.*;
// public class Esubarraywithgivensum {
//     public static void main(String[] args) {
//         int[] arr = {1, 9, 3, 7};
//         int n = arr.length, k = 10;
//         System.out.println("Subarray with given sum is: ");
//         subArrWithSumKBruteForce(arr, n, k);
//       }
    
//       public static void subArrWithSumKBruteForce(int[] arr, int n, int k) {
    
//         for (int i = 0; i < n; i++) {
//           int sum = 0;
//           for (int j = i; j < n; j++) {
//             sum += arr[j];
//             if (sum == k) {
//               for (int p = i; p <= j; p++)
//                 System.out.print(arr[p] + " ");
//               System.out.println();
//             }
//           }
//         }
//       }  
// }






// import java.util.*;
// public class Esubarraywithgivensum {
// public static void main(String[] args) {
//     int[] arr = {1, 9, 3, 7};
//     int n = arr.length, k = 10;
//     System.out.println("Subarray with given sum is: ");
//     subArrWithSumKOptimal(arr, n, k);
//   }

//   public static void subArrWithSumKOptimal(int[] arr, int n, int k) {
//     int start = 0, end = -1, sum = 0;
//     while (start < n) {
//       while ((end + 1 < n) && (sum + arr[end + 1] <= k))
//         sum += arr[++end];

//       if (sum == k) {
//         for (int p = start; p <= end; p++)
//           System.out.print(arr[p] + " ");
//         System.out.println();
//       }

//       sum -= arr[start];
//       start++;
//     }
//   }

// }

//sliding windows technique 
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Esubarraywithgivensum   {
    public static void main(String[] args) {
      
    int arr[] = {9, 10, 3 , 6 , 12 ,1};
        int left = 0;
        int right = 0;
        int sum = 0;
        int target = 13;
    

        while (right < arr.length) {


            sum += arr[right];
            right++;
            while (sum > target ) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                for (int i = left; i < right; i++) {
                 System.out.println(arr[i]);
                }
                return;
            }
        }



        
    }
}
