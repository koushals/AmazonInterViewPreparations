package QAE;

public class CommonCharOfTwoString {
    public static void main(String[] args) {
        System.out.println(compare("strong","string"));
        System.out.println(compare("sssssstrong","ssstring"));
        System.out.println(compare("",""));
        System.out.println(compare("WEDSD","qazswqazx"));
        System.out.println(compare("","qazswqazx"));
    }
    public static String  compare(String s1, String s2){
        if(s1.length() == 0 ||s2.length() == 0){return "";}
        else {
            String temp = "" ;
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if(a[i] == b[j]){
                        if (!temp.contains(b[j]+"")) {
                            temp = temp + b[j];
                        }
                    }
                }
            }
            return temp;
        }
    }
}
