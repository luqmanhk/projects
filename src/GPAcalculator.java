// Luqman Kabiru
// This program will calculate a student's GPA
import java.util.*;
public class GPAcalculator {
    public static void main(String[] args) {
        System.out.println("GPA Calculator =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        // program header
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.print("How many courses?: ");
        // asking user how many courses they took
        int n = sc.nextInt();

        int[] credits = new int[n];
        // array to store user's credits
        String[] courses = new String[n];
        // array to store user's grades

        for (int i = 0; i < n; i++) {
            // loop for each course
            System.out.print("For course " + (i + 1) + ", how many credits: ");
            // asking user how many credits for the course
            credits[i] = sc.nextInt();
            // store number of credits in this array
            System.out.print("For course " + (i + 1) + ", what letter grade: ");
            // asking user what the letter grade is for the course
            courses[i] = sc.next();
            // storing the letter grade in this array
        }

        double totalPoints = 0;
        // initializing the total gpa points
        int totalCredits = 0;
        // initializing the total credits

        for (int i = 0; i < n; i++) {
            // looping through each course to calculate gpa
            double score = convertGrade(courses[i]);
            // converting the letter grade into gpa score
            if (score < 0) {
                // if grade invalid
                System.out.println("Invalid letter grade entered. Program will stop.");
                return;
            }
            totalPoints += credits[i] * score;
            // added weighted grade to total
            totalCredits += credits[i];
            // add credits to total
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("You GPA is: %.2f\n", gpa);
        // output gpa
    }

    public static double convertGrade(String letterGrade) {
        String grade = letterGrade.toUpperCase();

        if (grade.equals("A")) {
            return 4.0;
        } else if (grade.equals("A-")) {
            return 3.67;
        } else if (grade.equals("B+")) {
            return 3.33;
        } else if (grade.equals("B")) {
            return 3.0;
        } else if (grade.equals("B-")) {
            return 2.67;
        } else if (grade.equals("C+")) {
            return 2.33;
        } else if (grade.equals("C")) {
            return 2.0;
        } else if (grade.equals("C-")) {
            return 1.67;
        } else if (grade.equals("D+")) {
            return 1.33;
        } else if (grade.equals("D")) {
            return 1.0;
        } else if (grade.equals("D-")) {
            return 0.67;
        } else if (grade.equals("F")) {
            return 0.0;
        } else {
            return -1.0; // invalid grade
        }
        // gpa for every letter grade
    }
}