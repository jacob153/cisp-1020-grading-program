/**
 * Grading Group Project
 * provide student name and id info
 */

/**
 * Student inherits GradeScale
 * enter individual Student first & last names
 * as well as their unique student ID 
 */

public class Student extends GradeScale{
	private String lastName;
	private String firstName;
	private int studentId;
	
	public Student() {
		
	}
	
	public Student(String lastName, String firstName, int studentId) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentId = studentId;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getLastName(String lastName) {
		return lastName;
	}
	
	public String getFirstName(String firstName) {
		return firstName;
	}
	
	public int getStudentId(int studentId) {
		return studentId;
	}
}
