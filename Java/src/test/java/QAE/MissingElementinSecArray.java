//Find the missing element from the given 2 array, second array is duplicate.
//        array 1: [1,2,3,4,5,6,7]
//        array2: [1,3,4,5,6,7]
//        they are expecting more logics, not single solution

package QAE;

public class MissingElementinSecArray {
    public static void main(String[] args) {
        missingElementinSecArray(new int[]{1, 2, 3, 5, 2, 3, 3}, new int[]{2, 1, 3, 2, 3, 2, 6});
    }

    public static void missingElementinSecArray(int[] a, int[] b){
        String result = "";
        for (int i = 0; i < a.length; i++) {
            boolean s = false;
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    s=true;
                    continue;
                }
            }
            if(s == false){
                result = result + a[i] +",";
            }
        }
    }
}
