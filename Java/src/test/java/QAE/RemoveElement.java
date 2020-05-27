package QAE;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3,2,2,3},3));

    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        List<Integer> l = new ArrayList<Integer>();
        for (int a: nums ) {
            if(a==val){
                count++;
            }else {
              l.add(a);
            }
        }
        System.out.println(l);
        return l.size();
    }

}
