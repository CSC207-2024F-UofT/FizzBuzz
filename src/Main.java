public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.main(args);
        int i = 100;
        while (i<101){
            i = fizzBuzz.doFizzBuzz(i);
        }
    }
}
