import java.util.Scanner;

//import javafx.scene.canvas.GraphicsContext;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tutionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor : prmpt user to enter student's name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student class level: ");
        this.gradeYear = sc.nextInt();

        setStudentID();
       // System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // Enroll in courses

    public void enroll() {
        // Get inside a loop, user hits 0

        do {

            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else {
            	//System.out.println("BREAK!");
                break;
            }
        } while (1 != 0);

        System.out.println("ENROLLED IN: " + courses);
        //System.out.println("TUTION BALANCE: " + tutionBalance);
    }
    // View balance
    
    public void viewBalance() {
    	System.out.println("Your balance is: $" + tutionBalance);
    }
    // Pay Tution
    public void payTution() {
    	viewBalance();
    	System.out.println("Enter your payment: $");
    	Scanner sc = new Scanner(System.in);
    	int payment = sc.nextInt();
    	tutionBalance = tutionBalance - payment;
    	System.out.println("Thank you for your payment of $" + payment);
    	viewBalance();
    	System.out.println(showInfo());
    }
    // Show Status
    
    public String showInfo() {
    	return "Name: " + firstName + " " + lastName +
    			"\nGrade Level: " + gradeYear +
    			"\nStudent ID: " + studentID +
    			"\nCourses Enrolled:" + courses +
    			"\nBalance: $" + tutionBalance;
    }

}
