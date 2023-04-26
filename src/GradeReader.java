
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeReader {

    public static ArrayList<ScoreList> readGrades(File f) {
        ArrayList<ScoreList> students = new ArrayList<>();
        
        try {
            
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                for(int i = 0; i < 6; i++) {
                    ArrayList<Assessment> quizzes;
                    ArrayList<Assessment> labAssignments;
                    ArrayList<Assessment> projects;
                    ArrayList<Assessment> exams;
                    ArrayList<Assessment> attendance;

                    String studentInfo = sc.nextLine();
                    String firstName = sc.next();
                    String lastName = sc.next();
                    String id = sc.next();
                    int newId = Integer.parseInt(id);
                    
                    String quizzesStr = sc.nextLine();
                    // Student st = new Student(firstName, lastName, Integer.parseInt(id));
                    String labAssignmentsStr = sc.nextLine();
                    String projectsStr = sc.nextLine();
                    String examsStr = sc.nextLine();
                    String attendanceStr = sc.nextLine();
                    

                    quizzes = parseScoresString(quizzesStr);
                    labAssignments = parseScoresString(labAssignmentsStr);
                    projects = parseScoresString(projectsStr);
                    exams = parseScoresString(examsStr);
                    attendance = parseScoresString(attendanceStr);

                    ScoreList scoreList = new ScoreList(lastName, firstName, newId, 
                        quizzes, labAssignments, projects, exams, attendance);
                    students.add(scoreList);    
                }
                
            }
            sc.close();
            return students;
        } catch (IOException e) {
            System.out.println("IOException:\n" + e.getMessage());
            return null;
        }

    }

    /**
     * @param str string
     * @return
     */
    public static ArrayList<Assessment> parseScoresString(String str) {
        String[] strs = str.split(" ");
        ArrayList<Assessment> assessments = new ArrayList<>();
        try {
            for (int i = 1; i < strs.length; i++) {
                double score = Double.parseDouble(strs[i]);
                assessments.add(new Assessment(score));
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return assessments;
    }

    
}
