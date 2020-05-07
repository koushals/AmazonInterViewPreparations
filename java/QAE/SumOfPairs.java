package QAE;

import java.util.HashSet;
        import java.util.Iterator;

public class SumOfPairs {
    public static void main(String[] args) {
        int a[] = {1, -2, 3, 4, 5, 1, 2, -1, 2, 3};
        int b[] = {2, 3, 5, 9, 3, 2, 1, 3, 6, 8,2};

        sumOfpairs(a,b, 7);
    }
    public static void  sumOfpairs(int a[],int b[],int total){
        HashSet<String> set = new HashSet<String>();
        for (int i = 0 ; i< a.length ; i++){
            for(int j=0;j<b.length;j++){
                if (a[i] + b[j] == total){
                    set.add("("+a[i]+","+b[j]+")");
                }
            }
        }
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
