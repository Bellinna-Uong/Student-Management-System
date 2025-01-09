import java.util.Scanner;

public class Student  {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null ;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor : prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Last Name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level :");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " "+ studentID);

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
                courses = course + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your balance is $" + tuitionBalance);
    }

    // Pay the tuition
    public void payTuitionint (){
        viewBalance();
        System.out.print("Enter your payment : $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    // Show status
}
