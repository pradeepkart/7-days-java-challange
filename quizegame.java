
import java.util.Scanner;

public class quizegame{
    public static void main(String[] args) {
        String[][] questions = {
                {"What is the capital of France?", "Paris", "London", "Berlin", "Madrid"},
                {"What is the largest planet in our solar system?", "Earth", "Jupiter", "Mars", "Venus"},
                {"Which element has the chemical symbol 'O'?", "Oxygen", "Gold", "Silver", "Iron"}
        };
        String[] correctAnswers = {"1", "2", "1"};
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(j + ". " + questions[i][j]);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();
            if (answer == Integer.parseInt(correctAnswers[i])) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer was " + correctAnswers[i] + ".");
            }
        }
        System.out.println("Quiz over! Your final score is: " + score + "/" + questions.length);
    }
}
