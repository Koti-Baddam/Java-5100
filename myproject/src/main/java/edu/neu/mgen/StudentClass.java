package edu.neu.mgen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentClass {

    static class Student {
        private int studentId;
        private String firstName;
        private String lastName;

        public Student(int studentId, String firstName, String lastName) {
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return studentId + ": " + firstName + " " + lastName;
        }
    }

    static class EngClass {
        private List<Student> students;

        public EngClass() {
            this.students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void deleteStudent(int studentId) {
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.studentId == studentId) {
                    iterator.remove();
                    break;
                }
            }
        }

        public void listStudents() {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        EngClass engClass = new EngClass();

        // Adding students with the new names
        engClass.addStudent(new Student(1, "Koti", "Baddam"));
        engClass.addStudent(new Student(2, "Varshetha", "Kulkarni"));
        engClass.addStudent(new Student(3, "Vaishnavi", "Anadh"));
        engClass.addStudent(new Student(4, "Irfan", "Shaik")); // Added Irfan as per request

        // Listing students
        engClass.listStudents();

        // Deleting a student for demonstration (optional)
        System.out.println("\nAfter deleting a student (for demonstration):");
        engClass.deleteStudent(2); // Deleting Varshetha for demonstration purposes

        // Listing students again to reflect deletion
        engClass.listStudents();
    }
}

