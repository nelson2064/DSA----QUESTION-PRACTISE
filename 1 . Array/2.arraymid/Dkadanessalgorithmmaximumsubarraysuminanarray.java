
import java.util.*;
// public class Dkadanessalgorithmmaximumsubarraysuminanarray {
    



//     public static int maxSubArray(int[] nums, ArrayList < Integer > subarray) {
//         int max_sum = Integer.MIN_VALUE;
//         int n = nums.length;
//         if (n == 1) {
//             return nums[0];
//         }
//         for (int i = 0; i <= n - 1; i++) {
//             for (int j = i; j <= n - 1; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++)
//                     sum = sum + nums[k];
//                 if (sum > max_sum) {
//                     subarray.clear();
//                     max_sum = sum;
//                     subarray.add(i);
//                     subarray.add(j);
//                 }
//             }
//         }
//         return max_sum;
//     }
//     public static void main(String args[]) {
//         int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//         ArrayList < Integer > subarray = new ArrayList < > ();
//         int lon = maxSubArray(arr, subarray);
//         System.out.println("The longest subarray with maximum sum is " + lon);
//         System.out.println("The subarray is ");
//         for (int i = subarray.get(0); i <= subarray.get(1); i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }
// }







// public class Dkadanessalgorithmmaximumsubarraysuminanarray {





// public static int maxSubArray(int[] nums, ArrayList < Integer > subarray) {
//     int max_sum = Integer.MIN_VALUE;
//     for (int i = 0; i < nums.length; i++) {
//         int curr_sum = 0;
//         for (int j = i; j < nums.length; j++) {
//             curr_sum += nums[j];
//             if (curr_sum > max_sum) {
//                 subarray.clear();
//                 max_sum = curr_sum;
//                 subarray.add(i);
//                 subarray.add(j);
//             }
//         }
//     }
//     return max_sum;
// }
// public static void main(String args[]) {
//     int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//     ArrayList < Integer > subarray = new ArrayList < > ();
//     int lon = maxSubArray(arr, subarray);
//     System.out.println("The longest subarray with maximum sum is " + lon);
//     System.out.println("The subarray is ");
//     for (int i = subarray.get(0); i <= subarray.get(1); i++) {
//         System.out.print(arr[i] + " ");
//     }

// }
// }




public class Dkadanessalgorithmmaximumsubarraysuminanarray {



    public static int maxSubArray(int[] nums,ArrayList<Integer> subarray) { 
        int Highest_value=Integer.MIN_VALUE , sum=0 ; 
        int s=0;
        for(int i=0;i<nums.length;i++){ 
            sum+=nums[i]; 
            
            if(sum>Highest_value)
            { 
                subarray.clear();
                Highest_value=sum; 
                subarray.add(s); //giving the starting value i mean the point from where the maximum value is calculated and get the maximum value and i means the end point
                subarray.add(i); //storing starting and ending index so that we can find index of the array whose sum is highest in comparison with other subarray
            } 
            // s denotes starting index so when value becames negative - in i point our starting point will not start in negative point it will start from i+1 index
            if(sum<0)
            {
                sum=0; 
                s=i+1;
                
            } 
        } 
 
        return Highest_value; 
    } 
    public static void main(String args[])
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        ArrayList<Integer> subarray=new ArrayList<>();
        int lon=maxSubArray(arr,subarray);
        System.out.println("The longest subarray with maximum sum is "+lon);
        System.out.println("The subarray is ");
        for(int i=subarray.get(0);i<=subarray.get(1);i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}