public class Student implements Comparable<Student>
{
    private String sLastName;
    private String sFirstName;
    private int studentId;

    public Student()
    {
        sLastName = "";
        sFirstName = "";
        studentId = 0;
    }

    /*
     * @param sLastName for student's last name
     * @param sFirstName for student's first name
     * @param studentId for student's ID number
     */
    public Student(String sLastName, String sFirstName, int studentId) 
    {
        this.sLastName  = sLastName;
        this.sFirstName = sFirstName;
        this.studentId  = studentId;
    }

    /*
     * @param sLastName the sLastName to set
     */
    public void setsLastName(String sLastName) 
    {
        this.sLastName = sLastName;
    }

    /*
     * @param sFirstName the sFirstName to set
     */
    public void setsFirstName(String sFirstName) 
    {
        this.sFirstName = sFirstName;
    }

    /*
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) 
    {
        this.studentId = studentId;
    }

    /*
     * @return the sLastName
     */
    public String getsLastName() 
    {
        return sLastName;
    }

    /*
     * @return the sFirstName
     */
    public String getsFirstName() 
    {
        return sFirstName;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() 
    {
        return studentId;
    }

    @Override
    public String toString()
    {
        return "Student Name: " + this.getsLastName() + ", " + this.getsFirstName() + ", " + getStudentId();
    }

    @Override
    public int compareTo(Student s)
    {
        return getsLastName().compareTo(s.getsLastName());
    }

}
