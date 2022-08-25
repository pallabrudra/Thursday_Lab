package studentmgm;

/*
 * develop an application where we will create batch with students.
1.there will be two course-java and aws.
2.after admission ,we will assign students with details like student id,student name,email id,ph no in that batch in which course
students took admission.
3.make sure each batch capacity is 50,we can't assign more than 50 students in the batch.
4.we can update students details also if required.
5.if student want to take admission other than these course to NoCourseFoundException will thrown.and print the message "no suitable course found".
6.at the time of updating student details,if any id not found so StudentIdNotFoundException will thrown, and print the message that "no such student found in system".
 */

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws NoCourseFoundException {
		int ch;
		String ch1;
		Scanner sc = new Scanner(System.in);
		StudentRecord st = new StudentRecord();
		do {
			System.out.println("~~Student Management System~~");
			System.out.println("=================================");
			System.out.println(" 1. Take Addmission\n 2. Update Details\n 3. View Details\n");
			System.out.println("Enter Choice: ");
			ch = sc.nextInt();
			//Chose option from the menu
			switch(ch) {
			case 1:
				//handle the exception
				try{
					st.createStudent(); // call createStudent() function
					break;
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
					System.exit(0);
				}
					
			case 2:try {
					st.updateStudent(); // call updateStudent() function
				    break;
				}catch(Exception e){
					System.out.println(e.getMessage());
					System.exit(0);
			}
			case 3: st.getAllDetails(); //call getAllDetails() function
					break;
			}
			System.out.println("Do you Want to continue(y/n):");
			ch1=sc.next();
		
				
		}while(ch1.equalsIgnoreCase("Y")); //loop continue until user is putting "y"
		System.out.println("Thank you...");
	}

}
