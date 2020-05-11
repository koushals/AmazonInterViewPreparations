package QAE;

public class SortAnArray {
    public static void main(String[] args) {
        System.out.println(sort1(new int[]{1, 2, 1, 4, 5, -8,4,-7, 2}));
        System.out.println(maxProduct(new int[]{1, 2, 1, 4, 5, -8,4,-7, 2}));
    }
    public static int maxProduct(int[] a){
       a=  sort(a);
       int r1;
       int r2;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
       if(a[0]<0&&a[1]<0){
           return a[0]*a[1]*a[a.length-1];
       }else {
           return a[a.length-1]*a[a.length-2]*a[a.length-3];
       }
    }

    public static int[] sort(int [] a){
        boolean a1 = false;
        do{
            a1 = false;
            int temp =0;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    a1 = true;
                }
            }
        }while (a1);
        return a;
    }

    public static int sort1(int [] a){
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if(a[i]!=a[j]&&a[k]!=a[i]&&a[k]!=a[j]) {
                        if (temp < a[i] * a[j] * a[k]) {
                            temp = a[i] * a[j] * a[k];
                            System.out.println(a[i] + "*" + a[j] + "*" + a[k] + "*" + temp);
                        }
                    }
                }
            }
        }
        return temp;
    }

}
