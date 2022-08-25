package studentmgm;

// This class contains getter and setter method to set and get all the values
public class Record {

 // Instance variables
 private int id;
 private String name;
 private long contactNumber;
 private String emailId;
 private String course;
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Record(int id, String name, long contactNumber, String emailId, String course) {
	super();
	this.id = id;
	this.name = name;
	this.contactNumber = contactNumber;
	this.emailId = emailId;
	this.course = course;
}
public Record() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}


}