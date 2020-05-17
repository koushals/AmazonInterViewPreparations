package QAE;

public class MaxAndMinoFMatrix {
    public static void main(String[] args) {
         int matrix[][] = {
                {1,22,2,-34,4},
                {1,2,-42,34,504},
                {111,0,243,34,40},
                {1,-2,2,-34,134},
                {1,-221,2,-394,4}
         };
        maxAndMinoFMatrix(matrix);
    }

    public static void maxAndMinoFMatrix(int[][] a){
        int rmax = Integer.MIN_VALUE;
        int j;
        int rmin = Integer.MAX_VALUE;
        int cmax = Integer.MIN_VALUE;
        int cmin = rmin;
        String max ="";
        String min ="";

        String rmn ="";
        String rmx ="";
        String cmn ="";
        String cmx = "";

        int count1 = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count = 0;
            count1 =0;
            for ( j = 0; j < a[i].length; j++) {
                count = count + a[i][j];
                count1 = count1 + a[j][i];
            }
            if(count>rmax){
                rmax =count;
                rmx = rmax +": row :"+(i+1) ;
            }
            if(count<rmin){
                rmin =count;
                rmn = rmin +": row :"+ (i+1) ;
            }
            if(count1>cmax){
                cmax =count1;
                cmx = cmax +": Col :"+(i+1);
            }
            if(count1<cmin){
                cmin=count1;
                cmn = cmin +": Col :"+(i+1);
            }
            System.out.println(count +"---------" +count1);
        }
        max = cmax > rmax ? cmx : rmx;
        min = cmin<rmin? cmn:rmn;
        System.out.println(max);
        System.out.println("---------" );
        System.out.println(min);

    }
}
