package QAE;

public class ReverseString {

    public static void main(String[] args) {
        reverseString("ertyuikjnbv");
        System.out.println(reverseStringEachWordOfaSentense("Rgbjhahc sasdfghs sxcvbnmz sertyuiv"));
    }
    public static String reverseString(String s){
        String revs = "";
        for (int i = s.length()-1;i>=0;i--){
            revs = revs + s.charAt(i);
        }
        System.out.println(revs);
        return revs;
    }
    public static String reverseStringEachWordOfaSentense(String s){
        String[] s1 = s.split(" ");
        String result = "";
        for (int i = 0; i < s1.length; i++) {
            result = result+" "+reverseString(s1[i]);
        }
        return result;
    }
}
