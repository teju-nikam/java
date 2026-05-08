package dkte.com;

import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        // Questions
        String[] questions = {
                "1. What is the capital of India?",
                "2. Which language is used for Android Development?",
                "3. Which keyword is used to create object in Java?",
                "4. Which company developed Java?",
                "5. What is 10 + 5 ?"
        };

        // Options
        String[][] options = {
                {"A. Mumbai", "B. Delhi", "C. Pune", "D. Chennai"},
                {"A. Python", "B. Java", "C. C", "D. PHP"},
                {"A. class", "B. void", "C. new", "D. static"},
                {"A. Microsoft", "B. Apple", "C. Sun Microsystems", "D. Google"},
                {"A. 12", "B. 15", "C. 20", "D. 25"}
        };

        // Correct Answers
        char[] answers = {'B', 'B', 'C', 'C', 'B'};

        System.out.println("===== JAVA QUIZ APPLICATION =====");

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            // Display options
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            // Check answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer is: " + answers[i]);
            }
        }

        // Final Result
        System.out.println("\n===== QUIZ RESULT =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        // Grade
        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}
