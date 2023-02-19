// public class Gmovezerostoend {
//     public static void main(String[] args) {
//         int arr[] ={ 1,2,0,1,0,4,0};
//          zerosToEnd(arr);
//       }
//       public static void zerosToEnd(int[] arr) {
  
//           int n = arr.length;
//           int temp[] = new int[n];
//           int k=0;
//           for (int i=0;i<n;i++){
//               if (arr[i]!=0){
//                   temp[k]=arr[i];
//                   k++;
//               }
//           }
         
//           while (k<n){
//               temp[k]=0;
//               k++;
//           }
//          for(int i=0;i<n;i++)
//          {
//              System.out.print(temp[i]+" ");
//          }
//       }
// }
    public class Gmovezerostoend  {
        public static void main(String[] args) {
        int arr[] ={ 1,2,0,1,0,4,0};
        zerosToEnd(arr);
    
        }
        public static void zerosToEnd(int[] arr) {
    

            // finding the first 0
    int k = 0;
            while (k < arr.length) {        
            if (arr[k] == 0) {
        
                break;
            } 
                k++;
            
            }



        //so i will always keep track the zero but j wil be in search of non zero whenever it find non zero we will swap with the i variable which track the 0 value
            int i = k , j = k+1;
            while(i<arr.length && j<arr.length){
    if(arr[j] != 0){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
    }
    j++;
            }
        
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        }
    }