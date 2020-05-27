package QAE;

import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (int a:nums) {
            s.add(a);
        }
        return s.size();
    }
}
