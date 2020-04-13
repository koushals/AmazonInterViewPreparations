public class LargestCharacter {
    public static void main(String[] args) {
        String longestWord = largestCharacter("happy+@#$%))(*^*(&^^Lovely)(*&^%day$%^&*the");
        System.out.println(longestWord);
    }

    public static String largestCharacter(String str){
        int count =0;
        int temp = 0;
        String result = "";
        String str1[] =str.replaceAll("[^a-zA-Z]" , " ").split(" ");
        System.out.println(str1.length);

        for(String s:str1){
            temp = s.length();
            if (temp>count){
              result = s;
              count = temp;
            }
        }
        return result;
    }
}
