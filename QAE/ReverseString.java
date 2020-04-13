public class ReverseString {

    public static void main(String[] args) {
        reverseString("ertyuikjnbv");
    }
    public static String reverseString(String s){
        String revs = "";
        for (int i = s.length()-1;i>=0;i--){
            revs = revs + s.charAt(i);
        }
        System.out.println(revs);
        return revs;
    }
}
