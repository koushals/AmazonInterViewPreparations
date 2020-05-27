package QAE;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{3,4,-1,2}));
        System.out.println(firstMissingPositive(new int[]{1,7,8,9,11,12}));
    }
    public static int firstMissingPositive(int[] nums){
        int count = 1;
        nums = sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                if (nums[i] == count){
                    count++;
                }else {
                    return count;
                }
            }
        }
        return count;
    }
    public static int[] sort(int[] nums){
        boolean b = false;
        int temp = 0;
        do{
            b=false;
            for (int i = 0; i < nums.length-1; i++) {
               if(nums[i]>nums[i+1]){
                   temp = nums[i];
                   nums[i] =  nums[i+1];
                   nums[i+1] = temp;
                   b = true;
               }
            }
        }while (b);

        return nums;
    }
}
