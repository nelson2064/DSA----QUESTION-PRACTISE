public class Gpositivenegative {
    public static int[] alternatePositiveNegative(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[index] = arr[i];
                index += 2;
            }
        }
        index = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                result[index] = arr[i];
                index += 2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
           int  result[] = alternatePositiveNegative(arr);
for(int i = 0 ; i<result.length ; i++){
    System.out.print(result[i] + " ");
}
    }
}
