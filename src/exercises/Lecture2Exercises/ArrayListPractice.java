package exercises.Lecture2Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Even Numbers Ex
        ArrayList<Integer> someIntegers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,33,52,101,1138));
        System.out.println(sumEvenNumbers(someIntegers));

        //String Ex
        String phrase = "I would not, could not, in the rain. Not in the dark. Not on a train. Not in a car. Not in a tree. I do not like them, Sam, you see. Not in a house. Not in a box. Not with a mouse. Not with a fox. I will not eat them here or there. I do not like them anywhere!";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        System.out.println("Enter a word length to search for:");
        int numChars = input.nextInt();

        printFiveLetterWords(wordList, numChars);
    }

    public static int sumEvenNumbers(ArrayList<Integer> array){
        int total = 0;
        for (int integer: array) {
            if (integer % 2 ==0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printFiveLetterWords(ArrayList<String> array, int length) {
        for (String word: array) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
