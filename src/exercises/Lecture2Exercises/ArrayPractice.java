package exercises.Lecture2Exercises;

public class ArrayPractice {

    public static void main(String[] args) {

        String drSuess = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] poemSplit = drSuess.split("\\.");

        System.out.println(java.util.Arrays.toString(poemSplit));

        int array1[] = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                System.out.println(array1[i]);
            }
        }
    }
}

