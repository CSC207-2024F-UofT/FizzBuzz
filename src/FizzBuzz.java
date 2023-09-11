/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
    // the public.static.void main(String[] args) tells java to run the file
        //for (int i = 1; i < 100; i++) {
        int i = 1;
        while (i < 100) {

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        // This is kind of like defining functions
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        // && is the symbol for and in Java instead of saying and (though it seems to work the same way)
        if (divisibleBy3 && divisibleBy5) {
            // you have to use this System.out.println thing instead of just .print
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {
        // java uses else if instead of elif
            System.out.println("Buzz");

        } else {

            System.out.println(i);



        }
        i++;
        return i;
    }
}
