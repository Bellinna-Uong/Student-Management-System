import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        System.out.print("Enter number of new student to enroll : ");
        Scanner sc = new Scanner(System.in);
        int numberStudents = sc.nextInt();
        Student[] students = new Student[numberStudents];

        for (int n = 0; n < numberStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        System.out.println("Informations : ");
        for (int n = 0; n < numberStudents; n++) {
            System.out.println(students[n].toString());
        }

    }
}
