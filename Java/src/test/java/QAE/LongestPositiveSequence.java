//Find the longest running positive sequence in an array -
//        Eg - [1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6]
//        It should return 5, with start index : 8

package QAE;

public class LongestPositiveSequence {

    public static void main(String[] args) {
        longestPositiveSequence(new int[]{1, 2, -3, 2, 3, 4, -6, -1,7,7,4,2, 3, 4, 5, -8, 5, 6});
    }

    public static String longestPositiveSequence(int[] a){
        int temp = 0;
        int index = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if(count == 0){
                index = i - temp;
            }
            if(a[i]>0){
                count++;
            }else {
                count =0;
            }
            if (temp<count){
                temp = count;
            }

        }
        return "It should return: "+ temp+ ", with start index : "+ index;
    }
}


// Questions:
// what if i have multiple sequences with same longest length
// what if it is null array
// what if -ve sequence is longer than actual sequence
//
