package grades;

import java.util.ArrayList;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Student {

    public static void main(String[] args) {
        Student brekken = new Student("Brekken");
        brekken.addGrade(100);
        brekken.addGrade(93);
        brekken.addGrade(84);
        brekken.addGrade(100);
        System.out.println(brekken.getName());
        System.out.println(brekken.getGradeAverage());
    }

    private String name;
    private ArrayList<Integer> grades;
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public String  getGradeAverage(){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        double grades = 0;
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            total += this.grades.get(i);
            grades++;

        }

        grades = total/grades;
        return df.format(grades);
    }

    @Override
    public String toString() {
        return this.name;
    }

}
