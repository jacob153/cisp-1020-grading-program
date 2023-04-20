import java.util.ArrayList;

public class ScoreList
{
    private ArrayList<Assessment> quizzes = new ArrayList<>();
    private ArrayList<Assessment> labAssignments = new ArrayList<>();
    private ArrayList<Assessment> projects = new ArrayList<>();
    private ArrayList<Assessment> exams = new ArrayList<>();
    private ArrayList<Assessment> attendance = new ArrayList<>();

    private ArrayList<Assessment> all = new ArrayList<>();

    public ScoreList(ArrayList<Assessment> quizzes, 
                     ArrayList<Assessment> labAssignments, 
                     ArrayList<Assessment> projects, 
                     ArrayList<Assessment> exams, 
                     ArrayList<Assessment> attendance) 
    {
        setScores(quizzes, labAssignments, projects, exams, attendance);
    }

    public void setScores(ArrayList<Assessment> quizzes, 
                          ArrayList<Assessment> labAssignments, 
                          ArrayList<Assessment> projects, 
                          ArrayList<Assessment> exams, 
                          ArrayList<Assessment> attendance)
    {
        this.quizzes = quizzes;
        this.labAssignments = labAssignments;
        this.projects = projects;
        this.exams = exams;
        this.attendance = attendance;
    }

    public double getFinalGrade()
    {
        double quizzesFinalGrade = (getSum(quizzes) * .2) / quizzes.size();
        double labFinalGrade = (getSum(labAssignments) * .2) / labAssignments.size();
        double projectsFinalGrade = (getSum(projects) * .1) / projects.size();
        double examsFinalGrade = (getSum(exams) * .4) / exams.size();
        double attendanceFinalGrade = (getSum(attendance) * .1) / attendance.size();
        
        return quizzesFinalGrade + labFinalGrade + projectsFinalGrade + examsFinalGrade + attendanceFinalGrade;
    }

    public double getSum(ArrayList<Assessment> assessments)
    {
        double sum = 0;
        for (Assessment a : assessments)
        {
            sum += a.getScore();
        }

        return sum;
    }

    public ArrayList<Assessment> getAllScores()
    {
        return this.all;
    }

    public ArrayList<Assessment> getQuizzes() 
    {
        return quizzes;
    }

    public void setQuizzes(ArrayList<Assessment> quizzes) 
    {
        this.quizzes = quizzes;
    }

    public ArrayList<Assessment> getLabAssignments() 
    {
        return labAssignments;
    }

    public void setLabAssignments(ArrayList<Assessment> labAssignments) 
    {
        this.labAssignments = labAssignments;
    }

    public ArrayList<Assessment> getProjects() 
    {
        return projects;
    }

    public void setProjects(ArrayList<Assessment> projects) 
    {
        this.projects = projects;
    }

    public ArrayList<Assessment> getExams() 
    {
        return exams;
    }

    public void setExams(ArrayList<Assessment> exams) 
    {
        this.exams = exams;
    }

    public ArrayList<Assessment> getAttendance() 
    {
        return attendance;
    }

    public void setAttendance(ArrayList<Assessment> attendance) 
    {
        this.attendance = attendance;
    }
}