
public class StudentManagementSystem {
    public static void main(String[] args) {
        // Declare arrays to store student data
        int[] rollNumbers = new int[5];
        float[] grades = new float[5];

        // Input student data
        for (int i = 0; i < 5; i++) {
            rollNumbers[i] = i + 1;
            grades[i] = (float) (i + 1) * 10;
        }

        // Display student data
        System.out.println("Student Data:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Roll Number: " + rollNumbers[i] + ", Grade: " + grades[i]);
        }

        // Search for a student by roll number
        int searchRollNumber = 4;
        for (int i = 0; i < 5; i++) {
            if (rollNumbers[i] == searchRollNumber) {
                System.out.println("Student found with grade: " + grades[i]);
                break;
            }
        }
    }
}
