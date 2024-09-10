public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int i = 100;
        while (i<123){
            i = fizzBuzz.doFizzBuzz(i);
        }
    }
}
