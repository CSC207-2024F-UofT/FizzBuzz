public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        int num = 1;
        while(num < 1000){
            if(num % 3 == 0 || num % 5 == 0){
                counter++;
            }
            num++;
        }
        System.out.println(counter);
    }
}
