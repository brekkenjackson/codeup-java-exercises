package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        HashMap<String, Student> students = new HashMap<>();
        Student brekken = new Student("Brekken");
        brekken.addGrade(100);
        brekken.addGrade(79);
        brekken.addGrade(96);
        Student midlyn = new Student("Midlyn");
        midlyn.addGrade(100);
        midlyn.addGrade(85);
        midlyn.addGrade(99);
        Student matthew = new Student("Matthew");
        matthew.addGrade(87);
        matthew.addGrade(69);
        matthew.addGrade(91);
        Student miguel = new Student("Miguel");
        miguel.addGrade(100);
        miguel.addGrade(82);
        miguel.addGrade(98);
        students.put("iAmTheBest", brekken);
        students.put("iAmTheWorst", midlyn);
        students.put("thatsWild", matthew);
        students.put("addMeOnLinkedIn", miguel);
        System.out.println("Here are our student usernames:\n");
        System.out.println(students.keySet() + "\n");
        boolean again = true;
        do {
            String key = input.getString("Which student is your favorite? ");
            displayStudentInfo(students, key);
            String repeat = input.getString("Do you have a second favorite? [y/n]");
            if (repeat.equals("n")){
                again = false;
                System.out.println("deuces");
            }
        } while (again);

    }
    public static void displayStudentInfo(HashMap<String, Student> studentMap, String key){
        if(studentMap.containsKey(key)){
            System.out.printf("Name: %s - Github Username: %s\n Average Grade: %s\n",studentMap.get(key), key,studentMap.get(key).getGradeAverage());
        }else{
            System.out.println("Username does not exist");
        }
    }
}
