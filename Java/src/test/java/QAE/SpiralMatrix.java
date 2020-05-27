package QAE;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3,4},
                {5, 6, 7,8},
                {9, 10, 11, 12},
                {13,14,15,16}};
        System.out.println(spiralOrder(a));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<Integer>();
        int startr =0;
        int endr = matrix.length;
        int startc =0;
        int endc =matrix.length;
        while(startr<endr && startc<endc){
            for (int i = startc; i < endc; ++i) {
                l.add(matrix[startr][i]);
            }
            startr++;
            for (int i = startr ; i < endr; ++i) {
                l.add(matrix[i][endc-1]);
            }
            endc--;
            if(startr<endr){
                for (int i = endc-1; i >= startc; --i) {
                    l.add(matrix[endr-1][i]);
                }
                endr--;
            }
            if(startc<endc){
                for (int i = endr-1; i >= startr; --i) {
                    l.add(matrix[i][startc]);
                }
                startc++;
            }
        }

        return l;
    }
}
