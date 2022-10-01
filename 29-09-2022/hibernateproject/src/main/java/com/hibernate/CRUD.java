package com.hibernate;
/*This is not Layered Archtecture*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CRUD {
	//static List<Course> courses=new ArrayList<Course>();
	Scanner sc=new Scanner(System.in);
	//Method for starting session
	public static Session getSession() {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
        return session;
    }
	// Method for add Instructor
    public void addInstructor(int idIns,String nameIns){
        try{
        	Session session = getSession();
        	session.beginTransaction();
   
            Instructor ins=new Instructor();
            ins.setInsId(idIns);
            ins.setInsName(nameIns);
            session.save(ins);
            session.getTransaction().commit();
            System.out.println("Record(s) inserted sucessessfully");
           
            session.close();
        }catch (Exception e) {
			System.out.println(e);
		}
        }
    //Method for display instructor by id
    public void retriveInstructor(int idIns)
    {
        try{
        	Session session = getSession();
        
        	session.beginTransaction();
        	Query q=session.createQuery("from Instructor where insId=:i");
		
        	q.setParameter("i", idIns);
        	List<Instructor> list=q.getResultList();
				
        	for(Instructor bk:list)
        	{
        		System.out.println("Instructor Id: "+bk.getInsId());
        		System.out.println("Instructor Name: "+bk.getInsName());
        	}
        	session.getTransaction().commit();
        }catch (Exception e) {
        	System.out.println(e);
		}
    }
    //Method for update instructor details
    public void updateInstructor(int idIns)
    {
    	try{
    	Session session = getSession();
    	session.beginTransaction();
    	Query q=session.createQuery("update Instructor set insName=:in where insId=:i");
    	
    	System.out.println("Enter Instructor name");
    	String iname=sc.next();
		q.setParameter("in", iname);
		q.setParameter("i", idIns);
		int r=q.executeUpdate();
		System.out.println(r+" record updated successfully");
    	session.getTransaction().commit();
    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
    //Method for delete Instructor
    public void deleteInstructor(int idIns)
    {
    	try{
    		Session session = getSession();
    	
    		session.beginTransaction();
    		Query q=session.createQuery("delete from Instructor where insId=:i");
	
    		q.setParameter("i", idIns);
    		int row=q.executeUpdate();
    		System.out.println(row+" record delete successfully");

    		session.getTransaction().commit();
    	}catch (Exception e) {
    		System.out.println(e);
		}
    }
    //Method for add a course
    public void addCourse(Course course)
    {
    	try{
    		Session session = getSession();
    	
    		session.beginTransaction();
            session.save(course);
      
             session.getTransaction().commit();
             System.out.println("Record(s) inserted sucessessfully");      
             session.close();
    	}catch (Exception e) {
    		System.out.println(e);
		}
    }
    //Method for modify a course
    public void modifyCourse(int cId)
    {
    	try{
    		Session session = getSession();
    		session.beginTransaction();
    
    		Query q=session.createQuery("update Course set courseName=:cn, courseDuration=:cd where courseId=:ci");
    		System.out.println("Enter Course name: ");
    		String cname=sc.nextLine();
    		q.setParameter("cn", cname);
    		System.out.println("Enter Course duration: ");
    		String cduration=sc.nextLine();
    		q.setParameter("cd", cduration);
    		q.setParameter("ci", cId);
    
	   		int r=q.executeUpdate();
	 		System.out.println(r+" record updated successfully");
	 		
            session.getTransaction().commit();
            session.close();
    	}catch (Exception e) {
    		System.out.println(e);
		}
    }
    //Method for delete a course
    public void deleteCourse(int cId)
    {
    	try{
    		Session session = getSession();
    		session.beginTransaction();
    
            Query q=session.createQuery("delete from Course c where c.courseId=:C");
     		q.setParameter("C", cId);
    		int row=q.executeUpdate();
      		System.out.println(row+" record delete successfully");
            session.getTransaction().commit();
            session.close();
    	}catch (Exception e) {
    		System.out.println(e);
		}
    }
    //Method for assign a instructor to a course
    public void assignCourseToInstructor(int inId,int cId) 
    {
		    try{
		    	//session started...
			    Session session = getSession();
			    session.beginTransaction();
			    
			    Instructor ins=session.get(Instructor.class,inId);
			
			    Course course=session.get(Course.class,cId);
			    List<Course> courses=new ArrayList<>();
			    courses.add(course);
			
			    ins.setCourses(courses);
			    course.setInstructor(ins);
			 
			    session.save(ins);
			    System.out.println("Instructor assigned successfully");
			    session.getTransaction().commit();
		    }catch (Exception e) {
		    	System.out.println(e);
			}


    }
}

