package grades;

import java.util.ArrayList;

public class Student {
    private String name;
//    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }
    public ArrayList getGrade(){
        return grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int sum = 0;
        for (int grade: grades){
            sum += grade;
        }
        return (sum / grades.size());
    }
}


