package QAE;

import java.util.*;

public class Sumof3Arrays{

    public static void main(String[] args) {
        List<List<Integer>> l = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(l);
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    List<Integer> l = new ArrayList<Integer>();
                    if(nums[i]+nums[j]+nums[k]==0 && i!=j && j!=k && k!=i){
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        Collections.sort(l);
                        if(!list.contains(l)){list.add(l);}

                        }
                    }
                }
            }
        return list;
    }




    }

