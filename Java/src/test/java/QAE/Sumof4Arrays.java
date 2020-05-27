package QAE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sumof4Arrays {

    public static void main(String[] args) {
        List<List<Integer>> l = fourSum(new int[]{1, 0, -1, 0, -2, 2},0);
        System.out.println(l);
    }


    public static List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    for (int l1 = 0; l1 < nums.length; l1++) {
                        List<Integer> l = new ArrayList<Integer>();
                        if (nums[i] + nums[j] + nums[k]+nums[l1] == target && i != j && j != k && k != i && i!= l1 && j!=l1 && k!= l1) {
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(nums[k]);
                            l.add(nums[l1]);
                            Collections.sort(l);
                            if (!list.contains(l)) {
                                list.add(l);
                            }
                        }
                    }
                }
            }
        }
        return list;
    }
}
