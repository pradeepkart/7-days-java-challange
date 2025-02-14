public class GuessingGame {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 100);
        int numberOfTries = 0;
        int guess;

        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = (int) (Math.random() * 100); // simulate user input
            numberOfTries++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You found the number in " + numberOfTries + " tries.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again!");
            } else {
                System.out.println("Your guess is too high. Try again!");
            }
        }
    }
}
