package QAE;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class DuplicateCount {
    public static void main(String[] args) {
//        System.out.println(count1("asdaafewascvbrewazxcvbgfrewqazxcftrewascvbnhjtrewqazxc"));
//        System.out.println(count(""));
//        System.out.println(count("ijhbfghijfasjas"));
//        System.out.println(count("asdfghjkl"));
//        System.out.println(count("$%^&*()OKNBVCDR%^&*(OKJBDER%"));
//        System.out.println(count("ASDFEWAZXDFGWZXSDsxchjhgfdxsdfraa"));
        System.out.println(count(new int[]{1, 2, 3, 4, 5, 2, 3, 2, 1, 3, 2, 12, 2, 3, 5, 6, 85, 4, 3, 1, 3, 4, 2, 4, 5}));

    }

    public static String count(int[] a){
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s = s+"'"+a[i]+"',";
        }
        return count2(s);
    }
    public static String count(String s1){
        char[] a = s1.toCharArray();
        String r = "";
        for (int i = 0; i < a.length; i++) {
            int count =0;
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>1){
                String temp = a[i]+""+count+"";
                if (!r.contains(temp)){
                    r = r+temp+" ";
                }
            }
        }
        return r;
    }

    public static String count1(String s1){
        String b =s1;
        String r = "";
        while (true){
            char[] a = b.toCharArray();
            int l2 = b.length();
            b = b.replaceAll(a[0]+"","");
            System.out.println(b);
            int l1 = l2 - b.length();
            String temp = "";
            temp = a[0]+""+l1;
            if(!r.contains(temp)){r=r+temp;}
            if(b.length()==0){break;}
        }
        return r;
    }

    public static String count2(String s1){
        String r = "";
        while (true){
            String[] a = s1.split(",");
            int l2 = s1.length();
            System.out.println(s1);
            s1 = s1.replaceAll(a[0]+",","");
            System.out.println(s1);
            int l1 = (l2 - s1.length())/(a[0].length()+1);
            String temp = "";
            temp = a[0]+""+l1;
            if(!r.contains(temp)){r=r+temp+" ";}
            if(s1.length()==0){break;}
            System.out.println(temp);
        }
        return r;
    }

}
