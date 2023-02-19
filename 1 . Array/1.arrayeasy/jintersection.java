
import java.util.*;
public class jintersection {



    
    public static int[] intersection(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();
    
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
    
        int[] intersection = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            intersection[k] = result.get(k);
        }
        return intersection;
    }
    public static void main(String[] args) {
        int arr1[] = {1 ,2  , 3 , 5 };
        int arr2[] = {1 , 5 , 6 , 7};
        



       int arr[]  = intersection(arr1, arr2);
       
       for(int i = 0 ;i<arr.length-1 ; i++){
        System.out.println(arr[i]);
       }

    }
    
}
