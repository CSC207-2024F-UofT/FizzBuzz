class FizzBuzz {
    private static boolean is3Divisible(int n) {
        return n % 3 == 0;
    }

    private static boolean is5Divisible(int n) {
        return n % 5 == 0;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean ok3 = is3Divisible(i);
            boolean ok5 = is5Divisible(i);
            boolean both = ok3 && ok5;

            System.out.println(both ? "FizzBuzz" : ok3 ? "Fizz" : ok5 ? "Buzz" : i);
        }
    }
}
