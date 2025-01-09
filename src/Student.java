import java.util.Scanner;

public class Student  {
    private final String firstName;
    private final String lastName;
    private final int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int id = 1000;

    //Constructor : prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Last Name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level :");
        this.gradeYear = in.nextInt();

        setStudentID();
    }

    // Generate an ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n   " + course;
                int costOfCourse = 600;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your balance is $" + tuitionBalance);
    }

    // Pay the tuition
    public void payTuition (){
        viewBalance();
        System.out.print("Enter your payment : $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    // Show status
    public String toString(){
        return firstName + " " + lastName + "\n Grade Level : " + gradeYear + "\n Student ID :" + studentID + "\nCourses Enrolled : " + courses + "\nBalance : $" + tuitionBalance;
    }
}
