package QAE;


//Given a binary array {0,1,1,0,0,1,0,0,1} ,
//sort the array in a way that all zeros come to the left and all the one's come to the right side of the array.


public class sortingZeroandOne {
    public static void main(String[] args) {
       int[] a = {0,1,1,1,1,1,0,0,0,1,0,0,1};
       int[] result = sortAnArray(a);
        for (int i = 0; i<result.length;i++){
            System.out.print (result[i] + " ");

        }
    }

    public static int[] sortAnArray(int[] a){
        int temp = 0;
        int j = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            j++;
        for (int i = 0; i<a.length-j;i++) {
            if (a[i] > a[i + 1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                swapped = true;
            }
        }
        }
        return a;
    }
}
