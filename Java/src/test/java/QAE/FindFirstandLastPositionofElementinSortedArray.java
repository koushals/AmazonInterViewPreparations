package QAE;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
         searchRange(new int[]{0, 1, 2, 1, 2, 3, 1, 2, 3, 4, 5}, 5);
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] r = {-1,-1};
        int temp = 0 ;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==target){
                if(r[0]==-1){
                    r[0] = i;
                    continue;
                }
            }
            if(nums[i]==target){
                if (i>temp){
                    temp = i;
                    r[1] = i;
                }
            }
        }
        System.out.println(r[0]+" ,"+r[1]);
        return r;
    }
}
