package org.launchcode.java.demos.lsn6inheritance.inheritanceStudio;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoice myMultipleChoice = new MultipleChoice("What sound does a cat make?\nA: Bark\nB: Meow\nPlease type a single letter", "b");
        myQuiz.addQuestion(myMultipleChoice);

        Checkbox myCheckbox = new Checkbox("Select all that apply, which items are fruits?\nA: Broccoli\nB: Apple\nC: Orange\nPlease type a single letter separated by a comma", "b,c");
        myQuiz.addQuestion(myCheckbox);

        TrueFalse myTrueFalse = new TrueFalse("Does this studio suck? Please answer 'true' or 'false'", "true");
        myQuiz.addQuestion(myTrueFalse);

        myQuiz.runQuiz();
    }
}