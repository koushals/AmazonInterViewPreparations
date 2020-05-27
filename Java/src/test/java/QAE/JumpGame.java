package QAE;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1,1, 0, 4,}));
    }
    public static boolean canJump(int[] nums) {
        int i = 0;
        boolean b = true;
        for (int j = 0; j < nums.length; j++) {
            int temp =j;
            if(nums[j] == 0 ) {return false;}
            while (b){
                try {
                    int curindex = temp + nums[temp];
                    if(nums[curindex] == 0 ) {return false;}
                    if(curindex == nums.length-1){
                        b =false;
                    }else {
                        temp = curindex;
                    }

                }catch (Exception e ){
                    return false;
                }
            }

        }

        return true;
    }
}
