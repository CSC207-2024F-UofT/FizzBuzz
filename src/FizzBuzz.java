/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) {
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) {
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) {
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//         For the while loop version
        int max = 100;
        int counter = 1;
        while(counter < max){
            counter = doFizzBuzz(counter);
        }
    }

    private static int doFizzBuzz(int counter) {
        boolean divisibleBy3 = counter % 3 == 0;
        boolean divisibleBy5 = counter % 5 == 0;
        if (divisibleBy3 && divisibleBy5) {
            System.out.println("Fizz Buzz");}
        else if (divisibleBy3) {
            System.out.println("Fizz");}
        else if (divisibleBy5) {
            System.out.println("Buzz");}
        else {
            System.out.println(counter);}
        counter++;
        return counter;
    }
}
