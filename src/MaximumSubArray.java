/*public class MaximumSubArray {
    public static void main(String[] args) {
        MaximumSubArray obj = new MaximumSubArray();
        int []num = {-2,1,-3,4,-1,2,1,-5,4};
        int result = obj.maxSubArray(num);
        System.out.println("Maximum subarray sum : "+ result);
    }
    public int maxSubArray(int [] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for(int i =1;i<nums.length;i++){
            
            currentSum = Math.max(nums[i] ,currentSum+nums[i]);
            maxSum = Math.max(maxSum ,currentSum);
            
        }
        return maxSum;
    }
    
    */
//}


//or  both is ok





/*public class MaximumSubArray {

    public static void main(String[] args) {

        int[] num = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(num);

        System.out.println(result);
    }

    public static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}*/


//if you want print maxSub and element also
public class MaximumSubArray {

    public static void main(String[] args) {

        int[] num = {-2,1,-3,4,-1,2,1,-5,4};

        maxSubArray(num);
    }

    public static void maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum = currentSum + nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum Sum : " + maxSum);

        System.out.print("Maximum Subarray : ");

        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
