import java.util.ArrayList;

public class Tester {

public static void main(String[] args) {
    ArrayList<Assessment> quizzes = new ArrayList<>();
    ArrayList<Assessment> labAssignments = new ArrayList<>();
    ArrayList<Assessment> projects = new ArrayList<>();
    ArrayList<Assessment> exams = new ArrayList<>();
    ArrayList<Assessment> attendance = new ArrayList<>();
    quizzes.add(80, null);

    ScoreList scores = new ScoreList(quizzes, labAssignments, projects, exams, attendance);

    GPA gpa = new GPA(scores);
    double calculatedGPA = gpa.calculateGPA();
    System.out.println("Calculated GPA: " + calculatedGPA);
}
}