import java.util.Scanner;

public class Student  {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor : prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Last Name: ");
        this.lastName = in.nextLine();

        System.out.println("; - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level :");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);

        setStudentID();
    }

    // Generate an ID
    private void String void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses

    // View balance

    // Pay the tuition

    // Show status
}
