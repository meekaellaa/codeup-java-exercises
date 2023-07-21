package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication (HashMap<String, Student> students, Input input){
    public static void runGradesApp() {


        System.out.println("Welcome");
        System.out.println("Here are the GitHub usernames of our students:\n");


        for (String username : students.keySet()) {
            System.out.printf("|%s|", username);
        }
        System.out.println();

        do {
            System.out.println(" What student would you like to see more information on?\n");
            String userInput = input.getString();

            if (students.containsKey(userInput.toLowerCase())) {
                Student s = students.get(userInput.toLowerCase());
                System.out.printf("%nName: %s - GitHub Username: %s%n", s.getName(), userInput);
                System.out.printf("Cuurent Average: %.1f%n%n", s.getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the username of \"%s\".%n%n", userInput);

            }
            System.out.println("Would like to see another Student?");
        } while (input.yesNo());
        System.out.println("Goodbye, and have a wonderful day!");
    }

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Raquel");
        students.put("raqueleatschicken", student1);
        student1.addGrade(90);
        student1.addGrade(89);
        student1.addGrade(91);

        Student student2 = new Student("Byron");
        students.put("byronbyronbyron", student2);
        student2.addGrade(94);
        student2.addGrade(82);
        student2.addGrade(95);

        Student student3 = new Student("Latasha");
        students.put("Latashafofasha", student3);
        student3.addGrade(97);
        student3.addGrade(87);
        student3.addGrade(98);


        Student student4 = new Student("Zachariah");
        students.put("zachattack", student4);
        student4.addGrade(90);
        student4.addGrade(89);
        student4.addGrade(91);

        Input input = new Input();
        runGradesApp(students, input);

    }
























}
