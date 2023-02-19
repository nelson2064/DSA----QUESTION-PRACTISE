
public class Alargestelement {
    public static void main(String[] args) {
        
                int arr[] = {5 ,6 ,78 ,6 ,7};
                int larg = 0;
            for(int i = 0 ; i<arr.length ; i++ ){
                if(arr[i] > larg){
                    larg = arr[i];
                }
            }
            System.out.println(larg);
    
        
    }
}
