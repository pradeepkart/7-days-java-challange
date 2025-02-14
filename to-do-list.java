import java.util.ArrayList;
import java.util.Scanner;

public class to_dolist {
    private static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List:");
            displayToDoList();
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Mark a task as complete");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the task to add:");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case 2:
                    System.out.println("Enter the task number to remove:");
                    int taskNumberToRemove = scanner.nextInt();
                    removeTask(taskNumberToRemove);
                    break;
                case 3:
                    System.out.println("Enter the task number to mark as complete:");
                    int taskNumberToComplete = scanner.nextInt();
                    markTaskAsComplete(taskNumberToComplete);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting To-Do List. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(String task) {
        toDoList.add(task);
        System.out.println("Task added: " + task);
    }

    private static void removeTask(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= toDoList.size()) {
            String removedTask = toDoList.remove(taskNumber - 1);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }

    private static void markTaskAsComplete(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= toDoList.size()) {
            String completedTask = toDoList.get(taskNumber - 1);
            System.out.println("Task completed: " + completedTask);
        } else {
            System.out.println("Invalid task number. Please try again.");
        }
    }

    private static void displayToDoList() {
        if (toDoList.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
