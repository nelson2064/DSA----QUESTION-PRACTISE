    public class Hlinearsearch {
        public static void main(String[] args) {
            int arr[] = {2 ,5, 7,2, 65 ,23};
            int search = 2;
            for(int i = 0 ; i<arr.length ; i++){
                if(search == arr[i]){
                    System.out.println("index " + i);
                    break;
                }
            }
        }
    }
