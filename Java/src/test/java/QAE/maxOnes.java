package QAE;

public class maxOnes {
    public static void main(String[] args) {
        System.out.println(macOnes(new int[]{0, 1,1, 1,1,0, 1, 1,1,0, 0, 0, 1}));
        System.out.println(macOnes(new int[]{0, 1, 0, 1, 0,1,0, 0, 0, 1}));
        System.out.println(macOnes(new int[]{0, 1, 0, 0, 1,1,0, 0, 0, 1}));
    }

    public static int macOnes(int[] a){
        if(a.length == 0){return 0;}
        int count = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==1){
                count++;
                if(count>temp){
                    temp = count;
                }
            }else { count =0;}
        }
    return temp;
    }
}
