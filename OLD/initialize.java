import java.util.ArrayList;

public class initialize {
    public initialize(){

        ArrayList<Assessment> quizzes = new ArrayList<>();
    ArrayList<Assessment> labAssignments = new ArrayList<>();
    ArrayList<Assessment> projects = new ArrayList<>();
    ArrayList<Assessment> exams = new ArrayList<>();
    ArrayList<Assessment> attendance = new ArrayList<>();
    Assessment.add(80, quizzes);
    Assessment.add(80, labAssignments);
    Assessment.add(80, projects);
    Assessment.add(80, exams);
    Assessment.add(80, attendance);

    return;

    }
}
