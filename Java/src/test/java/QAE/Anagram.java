import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("koushal","hello"));
        System.out.println(isAnagram("abc","bca"));
        System.out.println(isAnagram("abaaac","abbaca"));

    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char a[]  = str1.toCharArray();
        char b[]  = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i =0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
