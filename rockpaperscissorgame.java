public class RockPaperScissors {
    public static void main(String[] args) {
        int userChoice, computerChoice;
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors): ");
            userChoice = (int) (Math.random() * 3) + 1; // simulate user input
            computerChoice = (int) (Math.random() * 3) + 1;

            System.out.println("Computer chose: " + getChoiceString(computerChoice));

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win this round!");
                userWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }
        }

        System.out.println("Final score: You - " + userWins + ", Computer - " + computerWins);
    }

    public static String getChoiceString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "";
        }
    }
}
