import com.sun.source.tree.WhileLoopTree;

public class MinMaxGame {
    public static void main(String[] args) {
        int nums[] = { 1,3,5,2,4,8,2,2};

        int result = minMaxGame(nums);

        System.out.print("Final Remaining Number : "+result);

    }
    public static int minMaxGame(int [] nums){
        while(nums.length>1){
            int newNums[] = new int[nums.length/2];
            for(int i=0 ; i<newNums.length;i++){
                if(i%2==0){
                    newNums[i]=Math.min(nums[2*i],nums[2*i+1]);
                }
                else{
                    newNums[i]=Math.max(nums[2*i],nums[2*i+1]);
                }
            }

            System.out.print("New Array : ");
            for(int num:newNums){
                System.out.print(num+" ");
            }
            System.out.println();
            nums = newNums;
        }
        return nums[0];
    }
}
