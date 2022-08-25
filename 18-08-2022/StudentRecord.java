package studentmgm;

import java.util.Scanner;

public class StudentRecord {
	// Declare two array for java and aws course
	static Record studentjava[] = new Record[100];
	static Record studentaws[] = new Record[100];
	static Scanner sc = new Scanner(System.in);
	static int id=99;
	static int index=0, index1=0;
	//create Student method
	public static void createStudent() throws NoCourseFoundException
	{
		id++;
		System.out.println("==============================================");
		
		System.out.println("Enter Student name: ");
		String sname=sc.nextLine();
		
		System.out.println("Enter Phone number: ");
		long pnumber=sc.nextLong();
		
		System.out.println("Enter Email id: ");
		String email=sc.next();
		sc.nextLine();
		System.out.println("Enter course name: ");
		String course=sc.next();
		sc.nextLine();
		if(course.equalsIgnoreCase("Java"))
		{
			if(index <=50) //check whether this batch contains more than 50 students or not  
			{
				studentjava[index1] = new Record(id,sname, pnumber, email,course); //in studentjava array store all the record of a student
				index++;
			}
			else {
				System.out.println("We can't assign more than 50 students in the batch :-)");
				System.exit(0);
			}
		}
		else if(course.equalsIgnoreCase("Aws"))
		{
			if(index1 <=50) //check whether this batch contains more than 50 students or not 
			{
				studentaws[index1] = new Record(id,sname, pnumber, email,course);
				index1++;
			}
			else {
				System.out.println("We can't assign more than 50 students in the batch :-)");
				System.exit(0);
			}
		}
		else 
			throw new NoCourseFoundException("No course Available");
		
		System.out.println("Student details created successfully");
		
	}
	//Student Details Update Method
	public void updateStudent()
	{
		System.out.println("==============================================");
		System.out.println("Enter your ID: ");
		int id1 = sc.nextInt();
		int flag=0;
		System.out.println("Enter current course: ");
		String cr = sc.next();
		sc.nextLine();
		if(cr.equalsIgnoreCase("Java"))
		{
		for(int i=0;i<index;i++) {
			System.out.println(index);
			if(id1 == studentjava[i].getId()) // This block performs update only for java students
			{
				System.out.println("Which field you want to update?");
				System.out.println("1.Name\n2.Phone Number\n3.Email id\n4.Course");
				System.out.print("Enter Choice: ");
				int ch1=sc.nextInt();
				switch(ch1)
				{
				case 1: System.out.println("Enter Name: ");
						String n = sc.next();
						sc.nextLine();
						studentjava[i].setName(n);
						System.out.println("Update Sucessful...");
						break;
				case 2: System.out.println("Enter Phone number: ");
						long p = sc.nextLong();
						studentjava[i].setContactNumber(p);
						System.out.println("Update Sucessful...");
						break;
				case 3: System.out.println("Enter Email id: ");
						String e = sc.next();
						sc.nextLine();
						studentjava[i].setEmailId(e);
						System.out.println("Update Sucessful...");
						break;
				case 4: System.out.println("Enter course name: ");
						String c = sc.next();
						sc.nextLine();
						if(c.equalsIgnoreCase("Aws")) {  
							id++;
							studentaws[index1]=studentjava[i]; //transfer all details of current java student to aws student 
							
							String name2 = studentaws[i].getName();
							Long cnumber2=studentaws[i].getContactNumber();
							String email2 = studentaws[i].getEmailId();
							String course2 = c;
							studentaws[index1] = new Record(id, name2, cnumber2,email2,course2); //create a new record in aws student for changed java student
							index1++;
							System.out.println("Update Sucessful...");
						}
						else if(c.equalsIgnoreCase("Java"))
							System.out.println("You are Already is in java course...");
						else
							System.out.println("No such Course available");
						break;
				default: System.out.println("Wrong Input");
						 break;
				
				}
				
				}
			flag = 1;
			}
		}
		else if(cr.equalsIgnoreCase("Aws")) // This block performs update only for aws students
		{
		for(int j=0;j<index1;j++) {
			if(id1 == studentaws[j].getId())
			{
				System.out.println("Which field you want to update?");
				System.out.println("1.Name\n2.Phone Number\n3.Email id\n4.Course");
				System.out.print("Enter Choice: ");
				int ch1=sc.nextInt();
				switch(ch1)
				{
				case 1: System.out.println("Enter Name: ");
						String n = sc.next();
						sc.nextLine();
						studentaws[j].setName(n);
						System.out.println("Update Sucessful...");
						break;
				case 2: System.out.println("Enter Phone Number: ");
						long p = sc.nextLong();
						studentaws[j].setContactNumber(p);
						System.out.println("Update Sucessful...");
						break;
				case 3: System.out.println("Enter Email id: ");
						String e = sc.next();
						sc.nextLine();
						studentaws[j].setEmailId(e);
						System.out.println("Update Sucessful...");
						break;
				case 4: System.out.println("Enter course name: ");
						String c = sc.next();
						sc.nextLine();
						if(c.equalsIgnoreCase("Java")) {  
							
							id++;
							studentjava[index]=studentaws[j]; //transfer all details of current aws student to java student 
							
							String name2 = studentaws[j].getName();
							Long cnumber2=studentaws[j].getContactNumber();
							String email2 = studentaws[j].getEmailId();
							String course2 = c;
							studentjava[index] = new Record(id, name2, cnumber2,email2,course2); //create a new record in java student for changed aws student
							index++;
							System.out.println("Update Sucessful...");
						}
						else if(c.equalsIgnoreCase("Aws"))
							System.out.println("You are Already is in java course...");
						else
							System.out.println("No such Course available");
						break;
				default: System.out.println("Wrong Input");
						 break;
				
				}
				flag = 1;
			}
			
			}
		}
		else
			System.out.println("No course found");
		if(flag==0) // if flag variable still 0 then it is sure that no student id are found as user input 
			System.out.println("Student id not found...");
			
		
	}


//Method to show all the details of enrolled students
	public void getAllDetails() 
	{
			System.out.println("==============================================");
			
			for(int i=0;i<index;i++)
			{
				if(studentjava[i].getCourse() != null )
				{
					System.out.println("Student Id: "+studentjava[i].getId());
					System.out.println("Student Name: "+studentjava[i].getName());
					System.out.println("Contact Number: "+studentjava[i].getContactNumber());
					System.out.println("Email: "+studentjava[i].getEmailId());
					System.out.println("Course: "+studentjava[i].getCourse());
					System.out.println("==============================================");
				}
			}

			for(int i=0;i<index1;i++)
			{
				if(studentaws[i].getCourse() != null )
				{
					System.out.println("Student Id: "+studentaws[i].getId());
					System.out.println("Student Name: "+studentaws[i].getName());
					System.out.println("Contact Number: "+studentaws[i].getContactNumber());
					System.out.println("Email: "+studentaws[i].getEmailId());
					System.out.println("Course: "+studentaws[i].getCourse());
					System.out.println("==============================================");
				}
			}

		
		
	}
	

}
