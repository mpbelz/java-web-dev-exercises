package org.launchcode.java.demos.lsn6inheritance.inheritanceStudio;

//Requirements:
// Add questions to quiz
// Run the quiz
// Grade the quiz

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    //properties
    ArrayList<Question> questions = new ArrayList<Question>();
    int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    //constructor
    public Quiz() {

    }

    //methods
    public void addQuestion (Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //Loop through each question
        for (Question question : questions) {
            //ask user question
            System.out.println(question.getTheQuestion());
            //get the user answer
            String usersAnswer = this.getUsersAnswers();
            //check the answer
            boolean userIsCorrect = question.checkAnswer(usersAnswer);
            //Increment numberOfQuestionsCorrect if answered correctly
            if (userIsCorrect) {
                this.numberOfQuestionsCorrect++;
            }

        }

        //Grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Users Grade: " + percentageCorrect + "%");
    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}