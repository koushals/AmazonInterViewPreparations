//You are given an array of integers.
//Find the minimum difference between two prime numbers(Positive or negative) in the array
//when present with minimum time complexity and provide the test data to test the this code.


package QAE;

import java.util.ArrayList;
import java.util.HashSet;

public class MinDifferenceTwoPrimes {
    public static void main(String[] args) {

        System.out.println(new MinDifferenceTwoPrimes().minDifferenceTwoPrimes(new int[]{102, -113, 1, 45, 78, -2, -3, 7}));
        System.out.println(new MinDifferenceTwoPrimes().minDifferenceTwoPrimes(new int[]{97, -17, 1, 45,4,6, 78, -2, -3, 17}));
        System.out.println(new MinDifferenceTwoPrimes().minDifferenceTwoPrimes(new int[]{4, 4}));
        System.out.println(new MinDifferenceTwoPrimes().minDifferenceTwoPrimes(new int[]{5, 4}));
        System.out.println(new MinDifferenceTwoPrimes().minDifferenceTwoPrimes(new int[]{5}));
        System.out.println(new MinDifferenceTwoPrimes().minDifferenceTwoPrimes(new int[]{2, -2}));
        System.out.println(new MinDifferenceTwoPrimes().minDifferenceTwoPrimes(new int[]{-2, -2}));
        System.out.println(new MinDifferenceTwoPrimes().minDifferenceTwoPrimes(new int[]{}));
    }

    public int minDifferenceTwoPrimes(int[] a){
        if(a.length == 0) {return 0;}
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = 0;
        for (int i = 0; i < a.length ; i++) {
            if(isPrime(a[i])) {list.add(a[i]);}
        }
        if(list.size() == 0 || list.size() == 1) {return 0;}
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int diffrence = list.get(i) - list.get(j);
                if(diffrence<temp){
                    temp = diffrence;
                }
            }
        }
        return temp;

    }

    public boolean  isPrime(int a){
        if(a<0) {a = 0-a;}
        for (int i = 2; i <=Math.sqrt(a); i++) {
            if(a%i==0){return false;}
        }
        return true;
    }

}
