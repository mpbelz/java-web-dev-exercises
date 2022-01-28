package org.launchcode.java.demos.lsn6inheritance.inheritanceStudio;

public abstract class Question {
    //properties
    private String theQuestion;
    private String theAnswer;

    //constructor
    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    //getters and setters

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    //methods
//    public abstract boolean checkAnswer(String answer);
    public boolean checkAnswer(String answer) {
        //answer depends on question type

        String actualAnswer = this.getTheAnswer();
//        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
//            return true;
//        } else {
//            return false;
//        }
        return (answer.toUpperCase().equals(actualAnswer.toUpperCase()));
    }

}