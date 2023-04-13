/**
 * Grading Group Project
 * 
 * Instructor Last name, first name and id#
 */
public class Instructor {
	private String iLastName;
	private String iFirstName;
	private int InstructorId;
	/**
	 * @param iLastName
	 * @param iFirstName
	 * @param InstructorId
	 */
	public Instructor() {
		
	}
	
	public Instructor(String iLastName, String iFirstName, int InstructorId) {
		this.iLastName = iLastName;
		this.iFirstName = iFirstName;
		this.InstructorId = InstructorId;
	}

	/**
	 * @param iLastName the iLastName to set
	 */
	public void setiLastName(String iLastName) {
		this.iLastName = iLastName;
	}

	/**
	 * @param iFirstName the iFirstName to set
	 */
	public void setiFirstName(String iFirstName) {
		this.iFirstName = iFirstName;
	}

	/**
	 * @param InstructorId the InstructorId to set
	 */
	public void setInstructorId(int InstructorId) {
		this.InstructorId = InstructorId;
	}

	/**
	 * @return the iLastName
	 */
	public String getiLastName() {
		return iLastName;
	}

	/**
	 * @return the iFirstName
	 */
	public String getiFirstName() {
		return iFirstName;
	}

	/**
	 * @return the InstructorId
	 */
	public int getInstructorId() {
		return InstructorId;
	}
	
	@Override
	public String toString() {
		return "Instructor: " + this.getiLastName() + ", " + this.getiFirstName() + "  Instructor ID: " + this.getInstructorId();
	}
}
