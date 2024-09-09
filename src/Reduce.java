/***
 * In Reduce.java, write a main method that prints how many steps it takes to reach 0 if
 * you start at 100. Add this file to your project, commit, and push. If you don't get
 * the right answer, that's okay for now. This is to get you to practice. You'll have
 * until the end of the week to work out the details and submit your working code on MarkUs.
 */

public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int numSteps = 0;
        while (n > 0){
            if (n % 2 == 0){
                n /= 2;
            }
            else{
                n -= 1;
            }
            numSteps++;
        }
        System.out.println(numSteps);
    }
}
