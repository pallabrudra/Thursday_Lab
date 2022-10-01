package com.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudMain {

	public static void main(String[] args) {
		int idIns,ch;
	
		CRUD c=new CRUD();
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("==============================================");

				System.out.println("Courses and Instructors Management System");
				System.out.println("==============================================");
				System.out.println("1.Create Instructor\n2.Read Details of Instructor by Id\n3.Update Instructor by Id\n4.Delete Instructor by Id\n5.Add Course\n6.Assign instructor\n7.Modify Course Details\n8.Delete Course by Course Id\n9.Exit");
				System.out.println("Choose an option: ");
				ch=sc.nextInt();
				switch(ch)
				{
				
					case 1: System.out.println("Enter Instructor Id: ");
							idIns=sc.nextInt();
							System.out.println("Enter Instructor Name: ");
							String nameIns=sc.next();
							c.addInstructor(idIns, nameIns);
							break;
			        
					case 2: System.out.println("Enter Instructor Id: ");
							idIns=sc.nextInt();
							c.retriveInstructor(idIns);
							break;
					case 3: System.out.println("Enter Instructor Id: ");
							idIns=sc.nextInt();
							c.updateInstructor(idIns);
							break;
					case 4: System.out.println("Enter Instructor Id: ");
							idIns=sc.nextInt();
							c.deleteInstructor(idIns);
							break;
					case 5: sc.nextLine();
							System.out.println("Enter Course Name: ");
							String cname=sc.nextLine();
							System.out.println("Enter Course Duration: ");
							String cduration=sc.nextLine();
							Course course=new Course(cname,cduration);
							c.addCourse(course);
							break;
					case 6: System.out.println("Enter Instructor Id: ");
							idIns=sc.nextInt();
							System.out.println("Enter Course Id: ");
							int idC=sc.nextInt();
							c.assignCourseToInstructor(idIns,idC);
							break;
					case 7: System.out.println("Enter Course Id");
							int Cid=sc.nextInt();
							c.modifyCourse(Cid);
							break;
					case 8: System.out.println("Enter Course Id: ");
							Cid=sc.nextInt();
							c.deleteCourse(Cid);
							break;
					
		        
		    }
	}while(ch!=9);
	System.out.println("Thank you....");
	}
}
