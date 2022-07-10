
import java.util.Scanner;

class CodeCHALLENGE4 {
    public static void main(String[] args) {

        /*************************************************************
         Very good!!!

         Note: Start your count variable at 0 and make your max
         times 9 to get the same result. In coding, counters usually
         start at 0. We'll go more into that when we cover arrays later.
         ***************************************************************/

    /*
    Use a DO WHILE LOOP for the question below. If you like, limit
    how many times you can print to the console with an IF ELSE STATEMENT or WHILE LOOP.
    */

        // Question
        int count = 1;
        int maxTimes = 10;

        // Create input.

        // int maxTimes = scanner.nextInt(); //user inputs time

        // INCREMENT your counter variable in your DO WHILE LOOP. Counter is your ITERATOR.
        // int maxTimes; // Initialize variable where we plan to store user's input.

        // With a DO WHILE LOOP the code will run at least once before it test the condition (hoursWorked > maxHours)
        do {

            // Ask user to provide input based on question.
            System.out.println("How many times?");
            System.out.println("count number");
            count++;

        }

        while (count < maxTimes);
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();


        // counter = scanner.nextInt();

        scanner.close();
        // System.out.println("the time is" + counter);
    }

}
