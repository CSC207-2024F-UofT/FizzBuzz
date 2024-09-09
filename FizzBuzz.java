/**
 * Solve the FizzBuzz challenge.
 */
package lab1.FizzBuzz;

class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i ++) {
            checkFizzBuzz(i);
        }
    }


    private static void checkFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

}
