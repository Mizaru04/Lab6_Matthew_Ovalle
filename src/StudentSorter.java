import java.util.ArrayList;
import java.util.Collections;

public class StudentSorter {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Smith", 52314));
        students.add(new Student("Doe", 52267));
        students.add(new Student("Adams", 34198));
        students.add(new Student("Doe", 72931));
        students.add(new Student("Williams", 84392));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println("This is " + student.getLastName() +
                    ". Their student id is " + student.getStudentId() + ".");
        }

        Student newStudent = new Student("Adams", 34198);

        if (students.get(0).equals(newStudent))
            System.out.println("This student is already registered.");
        else
            System.out.println("This is a new student.");

        /*
        This is Adams. Their student id is 34198.
        This is Doe. Their student id is 52267.
        This is Doe. Their student id is 72931.
        This is Smith. Their student id is 52314.
        This is Williams. Their student id is 84392.
        This student is already registered.
        */
    }
}