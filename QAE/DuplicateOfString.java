import java.util.HashMap;
import java.util.HashSet;

public class DuplicateOfString {
    public static void main(String[] args) {
        String [] strArray = new String [] {"Om", "Om","Shankar","Tripathi", "Tom", "JeRRy", "Jerry","shankar"};
        duplicateOfString(strArray);
    }

    public static void duplicateOfString(String[] str){
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(String s : str){
            s= s.toLowerCase();
            map.put(s,map.containsKey(s)?map.get(s)+1:1);
        }
        for(String s : map.keySet()){
            if(map.get(s)>1){
                System.out.println(s+": "+map.get(s));
            }
        }
    }
}
