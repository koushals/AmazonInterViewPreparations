package QAE;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6},5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6},2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6},7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6},0));
    }
    public static int searchInsert(int[] nums, int target) {
        int temp = 0;
        if (nums[0]>=target){
            return 0;
        }else if (nums[nums.length-1]<=target){
            return nums.length;
        }else {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i]==target){
                    return i;
                }
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if(target>nums[i]&&target<nums[i+1]){
                return i+1;
            }
        }

    return 0;
    }
}
