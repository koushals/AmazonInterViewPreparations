//Write a program to test whether a string and all strings that can be made using the characters of that string are palindrome or not.
//        Eg:
//        Input Output
//        mmo True
//        yakak True
//        travel False
//
//        Note : Please do not use any inbuilt functions.



package QAE;

public class IsAnagramAPalendrome {
    public static void main(String[] args) {
        System.out.println(isAnagramAPalendrome("mom"));
        System.out.println(isAnagramAPalendrome("yakak"));
        System.out.println(isAnagramAPalendrome("travel"));
        System.out.println(isAnagramAPalendrome("eeddaaf"));

    }
    public  static  boolean isAnagramAPalendrome(String s){
        int cc1 = 0;
        String temp = s;
        if (s.length()%2 == 1){
            while (true){
                char[] b = temp.toCharArray();
                int l1 = temp.length();
                temp = temp.replaceAll(b[0]+"","");
                int l2 = l1 - temp.length();
                if (l2%2 == 1){
                    cc1++;
                }
                if (cc1 > 1) {
                    return false;
                }else {return  true;}

            }
        }else if (s.length()%2 == 0){
            while (true){
                char[] b = temp.toCharArray();
                int l1 = temp.length();
                temp = temp.replaceAll(b[0]+"","");
                int l2 = l1 - temp.length();
                if (l2%2 == 1){
                    cc1++;
                }
                if (cc1 > 0) {
                    return false;
                }else {return  true;}
            }
        }
        return true;
    }
}


//Questions
// can i have a different case in the program like aabbaaBBaa
//
