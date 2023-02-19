
import java.util.*;
public class IUnion {
    public static int[] findUnion(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] union = new int[m + n];
        int i = 0, j = 0, k = 0;
    
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                // System.out.println(k);
                union[k++] = arr1[i++];
              
                
            } else if (arr2[j] < arr1[i]) {
                union[k++] = arr2[j++];
            } else {
                union[k++] = arr1[i++];
                j++;
                
            }
        }
    
        while (i < m) {
            union[k++] = arr1[i++];
        }
    
        while (j < n) {
            union[k++] = arr2[j++];
        }
    
        return Arrays.copyOf(union, k);
    }
    
    public static void main(String[] args) {
        int arr1[] = {1 ,2  , 3 , 5 };
        int arr2[] = {1 , 5 , 6 , 7};
        



       int arr[]  = findUnion(arr1, arr2);
    //    for(int i = 0 ;i<arr.length-1 ; i++){
    //     System.out.println(arr[i]);
    //    }

    }
}
