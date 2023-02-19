public class Hsetmatrixzero {
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};

        int rmax = 0;
        for(int i = arr.length-1; i>=0 ; i--){
            if(arr[i] > rmax){
                rmax = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
