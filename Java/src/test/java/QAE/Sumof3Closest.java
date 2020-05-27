package QAE;

public class Sumof3Closest {

    public int threeSumClosest(int[] nums, int target) {
        int resultMin = Integer.MAX_VALUE;
        int resultMax = Integer.MIN_VALUE;
        int result = 0 ;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                     result = nums[i]+nums[j]+nums[k];
                    if(result<target && i!=j && j!=k && k!=i){
                        resultMin = nums[i]+nums[j]+nums[k];
                    }
                    if(nums[i]+nums[j]+nums[k]>resultMax && i!=j && j!=k && k!=i){
                        resultMax = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        return result;
    }
}
