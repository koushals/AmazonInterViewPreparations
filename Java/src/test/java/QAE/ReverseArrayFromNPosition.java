//Reverse an array in subset of N. Example:
//        input: Array = [1,2,3,4,5,6,7,8,9], N = 3
//        output: [3,2,1,6,5,4,9,8,7]


package QAE;


public class ReverseArrayFromNPosition {
    public static void main(String[] args) {
        reverseArrayFromNPosition(new int[]{1, 21, 12, 2, 4, 1, 14, 6, 6, 85, 2, 43, 5, 6},4);
        reverseArrayFromNPosition(new int[]{1, 21, 12, 2, 4, 1, 14, 6, 6, 85, 2, 43, 5, 6},14);
        reverseArrayFromNPosition(new int[]{},0);
        reverseArrayFromNPosition(new int[]{-2,-1,1,6,3,4,2,7,8,3,21,12,-9},6);
        reverseArrayFromNPosition(new int[]{0, 0, 12, 2, 4, 0, 43, 5, 6},4);
    }

    public  static  int[]  reverseArrayFromNPosition(int[] a,int n){
        if (a.length-1<n){
            System.out.println("this index is mpre than length of the array");
            return a;}
        else {
            int[] b = new int[a.length];
            int count = 0;
            for (int i = n-1; i>=0; i--) {
                for (int j = count; j < n; j++) {
                        b[j] = a[i];
                }
                count++;
            }
            for (int i = n; i <a.length ; i++) {
                b[i] = a[i];
            }
            System.out.println("");
            for (int i = 0; i <b.length ; i++) {
                System.out.print(b[i]+" ");
            }
            return b;
        }

    }
}
