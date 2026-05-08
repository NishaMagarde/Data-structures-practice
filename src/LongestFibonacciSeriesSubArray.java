public class LongestFibonacciSeriesSubArray {
    public static void main(String[] args) {
        int []arr ={1,1,2,3,5,8,2,4,6};
        int maxLength =0;
        int startIndex =0;
        for (int i=0 ; i<arr.length-2 ; i++){
            int a = arr[i];
            int b = arr[i+1];

            int length = 2;
            for(int j=i+2 ; j<arr.length ; j++){
               if(a+b == arr[j]) {
                   length++;
                   a = b;
                   b = arr[j];

            } else {
                break;
            }
        }
            if(length>maxLength && length>= 3){
                maxLength = length;
                startIndex=i;
            }
    }
        System.out.println(" Longest Fibonacci Subarray Length :"+maxLength);
        System.out.println("Series:");

        for(int i= startIndex; i<startIndex+maxLength; i++){
            System.out.print(arr[i]+" ");
        }
}
}
