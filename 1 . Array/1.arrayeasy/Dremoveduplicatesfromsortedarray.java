    import java.util.*;
    public class Dremoveduplicatesfromsortedarray {
        public static void main(String[] args) {
            int arr[] = {1 , 1,  1 ,1 , 2 , 2 , 3 ,  4 , 5 , 5};
            int k = 0;



                                                    
        for(int i = 1 ; i<arr.length ; i++ ){


            //if i != k it means i will try to find different number and k will keep track the common number so whever i will found the number which is not equal to k then i will put that uncommon number 
       //whenver i found the number which not equal to k on that time k will be increase by 1 because we have to remove the duplicate so we have to keep 1 number but we have to remove other common number so move to 1 postion and then replace the common number with uncommon number 
            if(arr[i] != arr[k]){
            k++;
    arr[k] = arr[i];
        }
        }
        
    for(int m = 0 ; m<=k ; m++){
        System.out.println(arr[m]);
    }
    
        }

    }
