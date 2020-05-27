package QAE;

public class ReverseArray {
    public static void main(String[] args) {
        long[] r = new long[]{ 1,2,3,4,3,5,3,2,2,6,3,5,7,3,6,3,5,2,7,3,7,8,4,6,4,2,0
                ,9,7,6,4,7,9,5,3,67,4,45,2,4,2,34,2,12,6,8,9,5,8,34,6,3,5,1,2,3,4,3,5,3,2,2,6,3,5,7
                ,3,6,3,5,2,7,3,7,8,4,6,4,2,0,9,7,6,4,7,9,5,3,67,4,45,2,4,2,34,2,12,6,8,9,5,8,34,6,3
                ,5,1,2,3,4,3,5,3,2,2,6,3,5,7,3,6,3,5,2,7,3,7,8,4,6,4,2,0,9,7,6,4,7,9,5,3,67,4,45,2,4,2,34,2,12,6,8,9,5,8,34,6,3,5,
                1,2,3,4,3,5,3,2,2,6,3,5,7,3,6,3,5,2,7,3,7,8,4,6,4,2,0,9,7,6,4,7,9,5,3,67,4,45,2,4,2,34,2,12,6,8,9,5,8,34,6,3,5,1,2
                ,3,4,3,5,3,2,2,6,3,5,7,3,6,3,5,2,7,3,7,8,4,6,4,2,0,9,7,6,4,7,9,5,3,67,4,45,2,4,2,34,2,12,6,8,9,5,8,34,6,3,5};
        reverse(r);
        System.out.println("*****************");
        r =reverse1(r);
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]+" ,");
        }

    }

    public static long[] reverse(long[] a){
        long s = System.nanoTime();
        long[] b = new long[a.length];
        long j=0;
        for (long i = a.length-1; i >= 0; i--) {
            b[(int) j] = a[(int) i];
            j++;
        }
        long f = System.nanoTime();
        System.out.println(f-s);
        return b;
    }

    public static long[] reverse1(long[] a){
        long s = System.nanoTime();
        long[] b = new long[a.length];
        int j=0;
        int i = a.length-1;
        while (i>=j){
           b[j] = a[i];
           b[i] = a[j];
           j++;
           i--;
        }
        long f = System.nanoTime();
        System.out.println(f-s);
        return b;
    }

}
