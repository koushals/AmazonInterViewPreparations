package QAE;

public class SubSet {

    public static void main(String[] args) {
        int[] S1 = {1,5,4,6,8,2};
        int[] S2 = {5,8,2};
        int[] S3 = {5,8,2,7};
        int[] S4 = {5,8,2,7,4,3,1,3,2,1,3};
        SubSet s = new SubSet();
        System.out.println(s.isSubSet(S1,S2));
        System.out.println(s.isSubSet(S1,S3));
        System.out.println(s.isSubSet(S1,S4));

    }

    public boolean isSubSet(int[] a, int[] b){
        if(a.length<b.length || a.length == 0 || b.length == 0){ return false;}
        else{
            for (int i=0; i<b.length;i++){
                int count = 0;
                for (int j = 0; j < a.length; j++) {
                    if(a[j]==b[i]){
                        count++;
                        }
                    }
                if (count==0){
                    return  false;
                }
            }
        }
        return true;
    }

}
