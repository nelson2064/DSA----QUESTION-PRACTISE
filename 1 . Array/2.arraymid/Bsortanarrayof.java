// #approach 1 : sorting 
// #approach 2 : counting sort
// #approach 3 : pointer approach 

// The problem is a variation of popular dutch national flag algorithm 
    
    
// #approach 3 : pointer approach 
// time complecity = O(N)
// space complecity = O(1)
    
    public class Bsortanarrayof {

            public static void sortColors(int[] nums) {
                int lo = 0; 
                int hi = nums.length - 1; 
                int mid = 0; 
                
                
            int temp;
                while (mid <= hi) { 
                    switch (nums[mid]) { 
                        
                            case 0:
                            temp = nums[lo];
                            nums[lo] = nums[mid];
                            nums[mid] = temp;
                            mid++;
                            lo++;
                        break;
                        
                            case 1:
                            mid++;
                            break;
                        
                            case 2:
                            temp = nums[mid];
                            nums[mid] = nums[hi];
                            nums[hi] = temp;
                            hi--;
                            break;
                        }  
                    
                }
            }
            public static void main(String[] args) {
                int arr[] = {2,0,2,1,1,0};
                sortColors(arr);
                for(int i = 0 ;i<arr.length ; i++){
                    System.out.print(arr[i]);
                }
            }

            
        }
