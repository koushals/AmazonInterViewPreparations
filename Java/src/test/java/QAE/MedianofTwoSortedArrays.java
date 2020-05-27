package QAE;

public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2,3}, new int[]{2}));
    }

    public static int[] merge(int[] a, int[] b){
        int[] result = new int[a.length+b.length];
        int index = 0;
        do {
            try {
                result[index] = a[index];
                result[index+a.length] = b[index];
            }catch (Exception e){};
            index++;
        }while (index <= result.length);
        return result;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length+nums2.length];
        result = merge(nums1,nums2);
        result = sort(result);
        if(result.length%2==1){
            return result[result.length/2];
        }else {
            int a = result[result.length/2];
            int b = result[(result.length/2)-1];
            if(a==b){ return b;}
            else{
                return (double) (a+b)/2;
            }
        }
    }

    public static int[] sort(int[] a){
        boolean b = true;
        do{
            b = false;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    b = true;
                }
            }
        }while(b);
        return a;
    }
}
