package QAE;

public class MergeAndSort {
    public static void main(String[] args) {
        merge(new int[]{1, 7, 3, 9, 0, 0, 0}, new int[]{2, 5, 8});
    }
    public static void merge(int[] a, int[] b){
        int index = 1;
        for (int i = a.length-1 ; i > b.length; i--) {
            a[i] = b[b.length-index];
            index++;
        }
        int[] c = sort(a);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+ ", ");
        }
    }
    public static int[] sort(int[] b){
        int temp = 0;

        while (true){
            int count= 0;
            for (int i = 0; i <b.length-1; i++) {
                if(b[i]<b[i+1]){
                    temp = b[i+1];
                    b[i+1]=b[i];
                    b[i] = temp;
                    count++;
                }
            }
            if (count == 0){
                break;
            }
        }
        return b;
    }
}
