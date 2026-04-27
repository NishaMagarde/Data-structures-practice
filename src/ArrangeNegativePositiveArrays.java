import java.util.Arrays;

public class ArrangeNegativePositiveArrays {
    public static void main(String[] args) {
        int [] arr={-12,11,-13,-5,6,-7,5-3,-6};

       int []result= arrangeNegPosArrays(arr);
        for(int num : arr)
        {
            System.out.print(num +" ");
        }
    }
    public static int [] arrangeNegPosArrays(int arr[]){

      // step 1:-move negative in left portion
       int j = 0;
       for(int i =0 ; i<arr.length;i++){
           if (arr[i]<0){
               int temp = arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
           }
       }

       Arrays.sort(arr);
       return arr;
    }
}
