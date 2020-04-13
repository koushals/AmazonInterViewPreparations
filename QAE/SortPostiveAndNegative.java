//package QAE;
//
////Given an array of positive and negative integers {-1,6,9,-4,-10,-9,8,8,4} (repetition allowed
////sort the array in a way such that the starting from a positive number, the elements should be
////arranged as one positive and one negative element maintaining insertion order. First element should
////be starting from positive integer and the resultant array should look like {6,-1,9,-4,8,-10,8,-9,4}
//
//import java.util.LinkedList;
//
//public class SortPostiveAndNegative {
//    public static void main(String[] args) {
//        int[] a = {-1,6,9,-4,-10,-9,8,8,4,-3,-2,-1,3,1,-9,-1};
//        int[] result = sortPositiveNegative(a);
//        for (int i:result){
//            System.out.print(i+" ");
//        }
//    }
//
//    public static Integer[] sortPositiveNegative(int []arr) {
//        int[] sortedArr=  sortAnArray(arr);
//        LinkedList<Integer> list= new LinkedList<Integer>();
//        int noOfp =0;
//        int noOfn =0;
//
//        for(int a : sortedArr){
//            if(a>0){ noOfp++; }
//            else {noOfn++;}
//            if (noOfn == 0 || noOfp == 0){return sortedArr;}
//        }
//        int position = 0;
//        int position1 = 0;
//        for(int i = 0;i<sortedArr.length;i++){
//            if(sortedArr[i]<0){
//                position = i+1;
//                list.add(position,sortedArr[i]);
//                continue;
//            }
//            if(sortedArr[i]>0){
//                list.add(position1,sortedArr[i]);
//                position1= position1+2;
//                continue;
//            }
//        }
//        list.remove(null);
//        return list.toArray(new int[list.size()]);
//
//    }
//
//       public static int[] sortAnArray(int[] a){
//        int temp = 0;
//        int j = 0;
//        boolean swapped = true;
//        while (swapped) {
//            swapped = false;
//            j++;
//        for (int i = 0; i<a.length-j;i++) {
//            if (a[i] > a[i + 1]) {
//                temp = a[i];
//                a[i] = a[i + 1];
//                a[i + 1] = temp;
//                swapped = true;
//            }
//        }
//        }
//        return a;
//    }
//}
