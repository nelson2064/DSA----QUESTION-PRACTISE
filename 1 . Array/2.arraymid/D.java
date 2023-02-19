
// public class D{
//     public static void main(String[] args) {
//         int arr[] = {1 , 2 , 3 , 4, 5};
//         for(int i = 0 ; i<arr.length ; i++){
//             for(int j = i+1 ; j<arr.length ; j++){ 
//                 System.out.print("(" + arr[i] + " , " + arr[j] + ")");
//             }
//             System.out.println();
//         }
//     }
// }




// public class D {

//     public static void main(String[] args) {
        
//         int arr[]={7 ,9 , 4 ,7 ,3 ,9};
//        for(int i = 0 ; i<arr.length ; i++){
//         for(int j = i ;j<arr.length ; j++){
//             for(int k = i ;k<=j ; k++){
//                 System.out.print(arr[k]);
//             }
//             System.out.println();
//         }
//         System.out.println();
//        }
//     }
// }




// import java.util.*;
// public class D {

//     public static void main(String[] args) {

//         int arr[]={1 , 2, 3 , 4 ,5};
//         int totalsum = 0;
//         int max = 0;
//        for(int i = 0 ; i<arr.length ; i++){
//         for(int j = i ;j<arr.length ; j++){
//             totalsum = 0;
//             for(int k = i ;k<=j ; k++){
//                 totalsum = totalsum + arr[k];
//                     max = Math.max(max , totalsum);
//             }
            
//         }
        
//        }
//        System.out.println(max);
//     }
// }







// public class D{
//     public static void main(String[] args) {

//         int minvaluemakinghighest = Integer.MIN_VALUE;
//         int sum = 0;
//         int[] number = {2,4,6,8,10};
        
//         int[] prefix = new int[number.length];
//         prefix[0] = number[0];
//         for(int i = 1 ; i<=prefix.length-1 ; i++){
//         prefix[i] = prefix[i-1] + number[i];
//         }
//         for(int i = 0 ; i<=number.length-1 ; i++){
//             sum = 0;
//         for(int j = i ; j<=number.length-1 ; j++){
//         sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

        
//         if(minvaluemakinghighest<sum){
//         minvaluemakinghighest = sum;
//         }
      
//         }
//         }
//         System.out.println(minvaluemakinghighest);
//         }
// }

// public class D{
//     public static void kadanes(int[] number){
//         int maxmiumSum = Integer.MIN_VALUE;
//         int currentSum=0;
        
//         for(int i = 0 ; i<number.length ; i++){
//         currentSum = currentSum+number[i];
//         // kadane's algorithm says that if there is any number who have a value
//         // negative make it 0
//         if(currentSum<0){
//         currentSum = 0;
//         }
//         maxmiumSum = Math.max(currentSum, maxmiumSum);
//         }
//         System.out.println("our max subnumberay sum is : " + maxmiumSum);
        
//         }
        
//         public static void main(String[] args) {
//         int number[] = {-2,-3,4,-1,-2,1,5,-3};
//         kadanes(number);
//         }
// }

public class D{
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4 , 5};
        int prefix[] = new int[arr.length];
        int sum = 0;
        int large = 0;
        prefix[0] = arr[0];
        for(int i =1 ; i<arr.length ; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        for(int i = 0 ;i<arr.length ; i++){
            sum = 0;
            for(int j = i ; j<arr.length ; j++){
                sum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum > large){
                    large = sum;
                }
            }
        }
        System.out.println(large);
    }
}