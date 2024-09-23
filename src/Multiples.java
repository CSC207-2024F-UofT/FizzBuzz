public class Multiples {
    public static void main(String[] args) {
        int n = 3;
        int c = 0;
        while (n < 1000) {
            boolean divisibleBy3 = n % 3 == 0;
            boolean divisibleBy5 = n % 5 == 0;

            if (divisibleBy3) {
                c++;
            } else {
                if (divisibleBy5) {
                    c++;
                }
            }
            n++;
        }
        System.out.println(c);
    }
}
