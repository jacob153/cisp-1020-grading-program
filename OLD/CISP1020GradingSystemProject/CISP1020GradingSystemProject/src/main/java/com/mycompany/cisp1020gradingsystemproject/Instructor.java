package com.mycompany.cisp1020gradingsystemproject;

public class Instructor 
{
    private String iLastName;
    private String iFirstName;
    private int instructorId;

    public Instructor() {}
    /*
     * @param iLastName
     * @param iFirstName
     * @param instructorId
     */
    public Instructor(String iLastName, String iFirstName, int instructorId) 
    {
        this.iLastName = iLastName;
        this.iFirstName = iFirstName;
        this.instructorId = instructorId;
    }

    /*
     * @param iLastName the iLastName to set
     */
    public void setiLastName(String iLastName) 
    {
        this.iLastName = iLastName;
    }

    /*
     * @param iFirstName the iFirstName to set
     */
    public void setiFirstName(String iFirstName) 
    {
        this.iFirstName = iFirstName;
    }

    /*
     * @param instructorId the instructorId to set
     */
    public void setInstructorId(int instructorId) 
    {
        this.instructorId = instructorId;
    }

    /*
     * @return the iLastName
     */
    public String getiLastName() 
    {
        return iLastName;
    }

    /*
     * @return the iFirstName
     */
    public String getiFirstName() 
    {
        return iFirstName;
    }

    /**
     * @return the instructorId
     */
    public int getInstructorId() 
    {
        return instructorId;
    }

    @Override
    public String toString() 
    {
        return "Instructor: " + this.getiLastName() + ", " + this.getiFirstName() + "  Instructor ID: " + this.getInstructorId();
    }
}