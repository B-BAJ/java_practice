import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();
        
        char grade;
        
        if (marks >= 0 && marks <= 29) {
            grade = 'F';
        } else if (marks >= 30 && marks <= 40) {
            grade = 'D';
        } else if (marks >= 41 && marks <= 60) {
            grade = 'C';
        } else if (marks >= 61 && marks <= 80) {
            grade = 'B';
        } else if (marks >= 81 && marks <= 100) {
            grade = 'A';
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
            scanner.close();
            return;
        }
        
        System.out.println("The student's grade is: " + grade);
        
        scanner.close();
    }
}
