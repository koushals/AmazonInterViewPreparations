import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class MaxConsecutiveRepetation {

    public static void main(String[] args) {

        repetaion("afssvklksnvhbsbbbbbjvsdssshjbvjhsddjhjhgffffffhjnskajhjdfhuhsdfghgf");
    }

    public static char repetaion(String abc){
        int count = 0;
        int most = 0;
        char current = '\0';
        char previous = '\0';
        char result = '\0';

        for (int i = 0 ; i < abc.length(); i++ ){
            current = abc.charAt(i);
            if(current == previous) {
                count++;
                if(most <= count) {
                    most = count;
                    result = current;
                }
            }else{
                count = 1;
            }
                previous = current;
        }
        System.out.println(result);
    return result;
    }
}
