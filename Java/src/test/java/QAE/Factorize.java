package QAE;

public class Factorize {
    public static void main(String[] args) {
        System.out.println(noOfZero(100));
    }
    public static long product(long a){
        long product = 1;
        for (int i = 2; i<=a; i++){
            product = product*i;
            System.out.println(i+" : "+product);
        }
        return product;
    }
    public static int noOfZero(long a){
        a = product(a);
        return (int) (a+"".length() - a+"".replaceAll("0","").length());
    }
}
