    public class Bsecondlargestelementwithoutsorting {
        public static void main(String[] args) {
            
            int arr[] = {5 ,6 ,78 ,6 ,7};
            int larg = 0;
    int secondlarg = 0;
    for(int i = 0 ; i<arr.length ; i++){
    if(arr[i] > larg) {
        secondlarg = larg;
        larg = arr[i];
    }  else if(arr[i] > secondlarg && arr[i] != larg){
        secondlarg = arr[i];
    }
    
    }


    System.out.println(larg);
    System.out.println(secondlarg);



    }
    }
