package QAE;

import java.util.*;

public class SecondMostRepeating {
    public static void main(String[] args) {

        counter("aaabbbggg");
        counter("aaabbbbggg");
    }
    public  static void counter(String  b){
        char[] a = b.toCharArray() ;
        int temp = Integer.MIN_VALUE;
        int rslt = 0;
        char sch = 'a';
        char fch = 'a';

        HashMap<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(!m.containsKey(a[i])){ m.put(a[i]+"",count);}

            if(temp<count){
                rslt = temp;
                temp = count;
                sch = fch;
                fch = a[i];
            }
        }
        for (Map.Entry<String, Integer> val: m.entrySet()) {
            System.out.println(val.getValue());
        }
        System.out.println(sch +" is the second most repeated element for "+ rslt );
    }


}
