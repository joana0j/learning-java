import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner numberEntry = new Scanner(System.in);
        int randomNumber = new Random().nextInt(10);
        int attempts = 0;
        int attemptsEntry = 0;

        String initialMessage = "Choose a number between 0 and 10";
        String errorMessage = String.format("What a pity! You could not hit the number in 5 attempts. The right number was %d", randomNumber);

        while (attempts < 5){
            System.out.println(initialMessage);
            attemptsEntry = numberEntry.nextInt();
            attempts++;

            if (attemptsEntry == randomNumber) {
                System.out.println(String.format("Congratulations! You hit the number in %d attempts", attempts));
                break;
            } else if (attemptsEntry < randomNumber) {
                System.out.println("The number entered is less than the generated number.");
            } else {
                System.out.println("The number entered is greater than the number generated");
            }

        }

        if (attempts == 5 && attemptsEntry != randomNumber) {
            System.out.println(errorMessage);
        }

    }
}