package grades;

import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student logan = new Student("logan");
        logan.addGrade(90);
        logan.addGrade(80);
        logan.addGrade(95);
        Student xavier = new Student("xavier");
        xavier.addGrade(90);
        xavier.addGrade(95);
        xavier.addGrade(100);
        Student wade = new Student("wade");
        wade.addGrade(75);
        wade.addGrade(70);
        wade.addGrade(80);
        Student steve = new Student("steve");
        steve.addGrade(90);
        steve.addGrade(95);
        steve.addGrade(95);
//        System.out.println(logan.getGradeAverage());
//        System.out.println(xavier.getGradeAverage());
//        System.out.println(wade.getGradeAverage());
//        System.out.println(steve.getGradeAverage());
        System.out.println(logan.getName());


        students.put("wolverineGit", logan);
        students.put("gitProfessorX", xavier);
        students.put("deadPoolTacos", wade);
        students.put("theCapHub", steve);

//        System.out.println(students.get("wolverineGit"));
//        System.out.println(students.getOrDefault("wolverineGit", logan));
//        System.out.println(logan.getGrade());
//        System.out.println(logan.getName());


//
//
//        System.out.println(students.keySet());
        Scanner sn = new Scanner(System.in);
        String confirm = "Yes";
        System.out.println("Welcome! \nHere are the GitHub usernames of our students: ");
        System.out.println(students.keySet());

        while( confirm.equalsIgnoreCase("Yes")) {
            System.out.println("What student would you like to see more information on?");
            Scanner scn = new Scanner(System.in);
            String userInput = scn.nextLine();
            for (int i = 0; i < students.size(); i++) {
                if (students.containsKey(userInput)) {
                    System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %s \n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());
                    break;
                } else {
                    System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", userInput);
                    break;
                }
            }
            System.out.println("Would you like to see another student? (yes/no)");
            confirm = sn.nextLine();
        }
        System.out.println("Good-bye, and have a wonderful day!");

    }

}
