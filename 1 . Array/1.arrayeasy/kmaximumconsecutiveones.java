import java.util.*;
public class kmaximumconsecutiveones{
    public static void main(String[] args) {
  
      int   arr[] = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
      
        System.out.println(  findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] arr {
    int max = 0;
    int count = 0;

    for(int i = 0  ; i<arr.length ; i++){
        if(arr[i] == 1){
            count+=1;
        }else if(arr[i] == 0){
            count = 0;
        }

        max = Math.max(max , count);
    }
       }
    }

// 1 1 0 1 1 1 0 0 0 1 1 1
// so  what we have to do is we have to find the max 
// so if we have 1100111
// then in this case max will be 3
// we have to find the place where 1 is most occured 