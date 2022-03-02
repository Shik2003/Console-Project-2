import java.util.Scanner;

//import java.util.Scanner;

public class Studentdatabaseapp {
	
	
	
    public static void main(String[] args) {
    	
//    	Scanner sc = new Scanner(System.in);
//        Student stu1 = new Student();
//        stu1.enroll();
//        stu1.payTution();
//        System.out.println(stu1.toString());

        // Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];
        
        // Create n number of new students
        
        for (int n =0; n < numOfStudents; n++) {
        	students[n] = new Student();
        	 students[n].enroll();		
        	students[n].payTution();
        	//System.out.println(students[n].toString());
        }
//        for (int n =0; n < numOfStudents; n++) {
//        	System.out.println(students[n].toString());
//        }
        
        
    }

}
