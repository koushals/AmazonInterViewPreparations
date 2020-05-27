package QAE;

public class SearchinRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(search(new int[]{0, 1, 4, 3, 2, 7, 5, 8, 9},10));
    }
    public  static int search(int[] nums, int target) {
        int index = -1;
        int j = 0;
        boolean b = false;
        int[] r1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target || b){
                b = true;
                r1[j] = nums[i];
                j++;
                if (nums[i]==target) index = i;
            }
        }
        if(index>0){
            for (int i = 0; i < index; i++) {
                r1[j] = nums[i];
                j++;
            }
        }
        for (int a1: r1) {
            System.out.print(a1);
        }
        System.out.println();
        return index;
    }
}
