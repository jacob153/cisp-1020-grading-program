import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeReader {
   
    public static ScoreList readGrades(File f)
    {
        ArrayList<Assessment> quizzes;
        ArrayList<Assessment> labAssignments;
        ArrayList<Assessment> projects;
        ArrayList<Assessment> exams;
        ArrayList<Assessment> attendance;
        try
        {
            Scanner sc = new Scanner(f);
            String firstName = sc.next();
            String lastName = sc.next();
            String id = sc.next();
            
            Student st = new Student(lastName, firstName, Integer.parseInt(id));

            String quizzesStr = sc.nextLine();
            String labAssignmentsStr = sc.nextLine(); 
            String projectsStr = sc.nextLine();
            String examsStr = sc.nextLine();
            String attendanceStr = sc.nextLine();
            sc.close();

            quizzes = parseScoresString(quizzesStr);
            labAssignments = parseScoresString(labAssignmentsStr);
            projects = parseScoresString(projectsStr);
            exams = parseScoresString(examsStr);
            attendance = parseScoresString(attendanceStr);

        }
        catch (IOException e)
        {
            System.out.println("IOException:\n" + e.getMessage());
            return null;
        }

        ScoreList scoreList = new ScoreList(quizzes, labAssignments, projects, exams, attendance);
        return scoreList;
    }

    /**
     * @param str
     * @return
     */
    public static ArrayList<Assessment> parseScoresString(String str)
    {
        String[] strs = str.split(" ");
        ArrayList<Assessment> assessments = new ArrayList<>();
        try 
        {
            for (int i = 0; i < strs.length; i++)
            {
                double score = Double.parseDouble(strs[i]);
                assessments.add(new Assessment(score));
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
        }

        return assessments;
    } 
}


