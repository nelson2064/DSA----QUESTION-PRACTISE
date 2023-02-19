import java.util.*;

// public class Fstockbuyandsell {
//     public static void main(String[] args) {
//         int arr[] = {7,1,5,3,6,4};
//         int maxPro = maxProfit(arr);
//         System.out.println("Max profit is: " + maxPro);
//     }

//     static int maxProfit(int[] arr) {
//         int maxPro = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     maxPro = Math.max(arr[j] - arr[i], maxPro);
//                 }
//             }
//         }
//         return maxPro;
//     }
// }

// public class Fstockbuyandsell {

//   public static void main(String[] args) {
//     int arr[] = {7,1,5,3,6,4};

//     int maxPro = maxProfit(arr);
//     System.out.println("Max profit is: " + maxPro);

//   }
//   static int maxProfit(int[] arr) {
//     int maxPro = 0;
//     int minPrice = Integer.MAX_VALUE;
//     for (int i = 0; i < arr.length; i++) {
//       minPrice = Math.min(minPrice, arr[i]);
//       maxPro = Math.max(maxPro, arr[i] - minPrice);
//     }
//     return maxPro;
//   }
// }


// buy and sell stock first buy the stock in less price and sell it in higher price

public class Fstockbuyandsell {

  public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};
int maxPro = 0;
int minPro = Integer.MAX_VALUE;
  for(int i = 0 ;i<arr.length ; i++){
    for(int j = i+1 ; j<arr.length ; j++){
      if(arr[j] > arr[i]){
             maxPro = Math.max(maxPro ,j);
          
      }
      if(arr[j] < arr[i]){
        minPro = Math.min(minPro , j);
      }
    }
  }
System.out.println(maxPro);
System.out.println(minPro);
  }
 
}