public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int n = 100;
        while (n > 0){
            if (n % 2 == 0){
                n = n / 2;
            }
            else{
                n--;
            }
            step ++;
        }
    System.out.println(step);
    }
}
