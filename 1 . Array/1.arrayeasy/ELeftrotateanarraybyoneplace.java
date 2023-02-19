// public class ELeftrotateanarraybyoneplace {
//     public static void main(String[] args) {
        
//         int arr[] = {5 ,6 ,78 ,6 ,7};

//         int temp[] = new int[arr.length];
//  for(int i = 1 ; i<arr.length ; i++){
// temp[i-1] = arr[i];

//  }
//  temp[arr.length-1] = arr[0];
//  for(int i = 0 ; i<arr.length ; i++){
//     System.out.print(temp[i]);
//  }




// }
// }
public class ELeftrotateanarraybyoneplace {
    public static void main(String[] args) {
        
        int arr[] = {5 ,6 ,78 ,6 ,7};

        int temp = arr[0];
 for(int i = 1 ; i<arr.length ; i++){
arr[i-1] = arr[i];

 }
 arr[arr.length-1] = temp;
 for(int i = 0 ; i<arr.length ; i++){
    System.out.println(arr[i]);
 }




}
}
