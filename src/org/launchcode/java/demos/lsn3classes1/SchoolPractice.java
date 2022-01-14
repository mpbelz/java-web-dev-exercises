package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student matt = new Student();
        matt.setName("Matt");
        matt.setNumberOfCredits(1);
        matt.setGpa(4.0);
        System.out.println("Student's Name: " + matt.getName());
        System.out.println("Student's GPA: " + matt.getGpa());
        System.out.println("Student's Credits: " + matt.getNumberOfCredits());
    }
}
