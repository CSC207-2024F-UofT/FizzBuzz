/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) { //the increment happens in the to part wheras python increments it in its loop

            int i = 1;
            while(i < 100){
                i = doFizzBuzz(i);
            }
    }

    private static int doFizzBuzz(int i) {
        //things are already intialized

        // Find out which numbers divide i.

        //must define which var is what type
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else { // edit changes

            System.out.println(i);

        }

        i++;
        return i;
    }
}
