  public class Ccheckifarrayissorted {
      
      public static void main(String[] args) {
          
              int arr[] = {1 , 2 , 3 , 4 , 5};
              int larg = 0;
          for(int i = 1 ; i<arr.length ; i++){
            if(arr[i] < arr[i-1]){
              System.out.println("not sorted");
              break;
            }
          }
          System.out.println("sorted");
          }
        
      

      

      }
    