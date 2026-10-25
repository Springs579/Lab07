import java.util.Random;
import java.util.Scanner;

public class DieRollar {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String again;

        do {
            int roll = 0;
            int die1, die2, die3;

            // Header row
            System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            // Throw until all three dice match (a triple)
            do {
                roll++;
                die1 = rand.nextInt(6) + 1;   // 1 - 6
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-8d%-8d%-8d%-8d%-8d%n", roll, die1, die2, die3, sum);

            } while (!(die1 == die2 && die2 == die3));

            System.out.println("\nTriple rolled after " + roll + " throw(s)!");

            // Offer to continue
            System.out.print("\nRoll again? (y/n): ");
            again = input.nextLine().trim();
            System.out.println();

        } while (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing. Goodbye!");
        input.close();
    }
}
