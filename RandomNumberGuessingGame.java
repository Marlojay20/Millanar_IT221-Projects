
package randomnumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGame {
  public static void main(String[] args) {
    // Generate a random number to be guessed
    Random random = new Random();
    int number = random.nextInt(100); // random number between 0 and 99

    Scanner scanner = new Scanner(System.in);
    int guess;
    do {
      System.out.print("Enter your guess: ");
      guess = scanner.nextInt();

      if (guess > number) {
        System.out.println("Too high, try again.");
      } else if (guess < number) {
        System.out.println("Too low, try again.");
      }
    } while (guess != number);

    System.out.println("You guessed the number!");
  }
}
