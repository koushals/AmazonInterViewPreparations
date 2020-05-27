//A 2d array has 0 and 1 as values. In one flip,
// 0's are changed to 1 if and only if any of the neighbors (left, right, top, bottom) is 1.
// Return the total number of flips required to convert the whole grid to 1's





package QAE;

public class ZeroToOneFlip {

    public static void main(String[] args) {
        int[][] a = {{0,0,1},{0,0,0},{0,0,0},{1,0,0},{0,0,0},{0,0,0}};
        System.out.println(zeroToOneFlip(a));
    }

    public static int zeroToOneFlip(int[][] a){
        int count = 0;
        while (true) {
            int c = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]+ " ");
                }
                System.out.println();

            }
            System.out.println("-----------------");

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == 0 ) {
                        if (isOne(a, i, j)) {
                            a[i][j] = 1;
                            c++;
                        }
                    }
                }

            }
            if (c==0){
                break;
            }else {count++;}
        }
        return count;
    }

    public static boolean isOne(int[][] a,int i,int j){
        try{ if (a[i+1][j]==1 ){return true;}  }catch(Exception e){};
        try{ if ( a[i-1][j]==1 ){return true;}  }catch(Exception e){};
        try{ if (a[i][j+1]==1 ){return true;}  }catch(Exception e){};
        try{ if ( a[i][j-1]==1 ){return true;}  }catch(Exception e){};
        return false;
    }

}
