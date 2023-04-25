import java.util.ArrayList;

public class ViewGpa {
    public ViewGpa(){
    ArrayList<Assessment> quizzes = new ArrayList<>();
    ArrayList<Assessment> labAssignments = new ArrayList<>();
    ArrayList<Assessment> projects = new ArrayList<>();
    ArrayList<Assessment> exams = new ArrayList<>();
    ArrayList<Assessment> attendance = new ArrayList<>();



    ScoreList scores = new ScoreList(quizzes, labAssignments, projects, exams, attendance);

    Assessment.add(80, quizzes);
    Assessment.add(80, labAssignments);
    Assessment.add(80, projects);
    Assessment.add(80, exams);
    Assessment.add(80, attendance);
    System.out.println(quizzes);

    GPA gpa = new GPA(scores);
    double calculatedGPA = gpa.calculateGPA();
    System.out.println("Calculated GPA: " + calculatedGPA);
    System.out.println("Enter 99 to go back");
        }
    }