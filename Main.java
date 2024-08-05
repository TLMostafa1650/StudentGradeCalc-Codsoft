/**
 * @author Mostafa EL-Hosseny
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int Num_Of_Subjects = 0;

        while (true) {
            System.out.println("Welcome To TLMO'S STUDENT GRADE CALCULATOR \n Please, Enter The Number Of Subjects: ");
            if (user_input.hasNextInt()) {
                Num_Of_Subjects = user_input.nextInt();
                if (Num_Of_Subjects > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. \n Reason: Number of subjects must be a positive Integer");
                }
            } else {
                System.out.println("Invalid input. \n Reason: Number of subjects must be an Integer value");
                user_input.next();
            }
        }
        int[] marks = new int[Num_Of_Subjects];
        int total_marks = 0;

        for (int i = 0; i < Num_Of_Subjects; i++) {
            while (true) {
                System.out.println("Great! \n Please, Enter The Marks for Subject " + (i + 1) + ": ");
                if (user_input.hasNextInt()) {
                    marks[i] = user_input.nextInt();
                    if (marks[i] >= 0 && marks[i] <= 100) {
                        total_marks += marks[i];
                        break;
                    } else {
                        System.out.println("Invalid input. Marks must be between 0 and 100.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer value.");
                    user_input.next(); // Clear the invalid input
                }
            }
        }


        double average = (double) total_marks / Num_Of_Subjects;

        String Grade;
        if (average >= 90) {
            Grade = "A";
        } else if (average >= 85) {
            Grade = "A-";
        } else if (average >= 80) {
            Grade = "B+";
        } else if (average >= 75) {
            Grade = "B";
        } else if (average >= 70) {
            Grade = "B-";
        } else if (average >= 65) {
            Grade = "C+";
        } else if (average >= 60) {
            Grade = "C";
        } else if (average >= 56) {
            Grade = "C-";
        } else if (average >= 53) {
            Grade = "D+";
        } else if (average >= 50) {
            Grade = "D";
        } else
            Grade = "F";
        System.out.println("Your Total Marks: " + total_marks);
        System.out.println("Your Average Percentage: " + average + " % ");
        System.out.println("Your Grade (GPA): " + Grade);
    }
}