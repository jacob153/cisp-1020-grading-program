import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class marp {
    private Menu Menu;
    private static CLS CLS;
    private static Sleep Sleep;
    private static GradeWriter GradeWriter;
    /**
     * @throws IOException
     */
    public marp() throws IOException{
    
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Assessment> quizzes = new ArrayList<>();
            ArrayList<Assessment> labAssignments = new ArrayList<>();
            ArrayList<Assessment> projects = new ArrayList<>();
            ArrayList<Assessment> exams = new ArrayList<>();
            ArrayList<Assessment> attendance = new ArrayList<>();
            ArrayList<Student> student1 = new ArrayList<>();
            ArrayList<Student> student2 = new ArrayList<>();

            ScoreList scoreList = new ScoreList(quizzes, labAssignments, projects, exams, attendance);

            boolean continueInput = true;

            while (continueInput) {
                int clear = 0;
                //if(clear == 0){
                //    CLS = new CLS();
                //}
                System.out.println("1. Add grade");
                System.out.println("2. Modify grade");
                System.out.println("3. Remove grade");
                System.out.println("4. Print final grade");
                System.out.println("99. Back to Main Menu");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 99) {
                    Menu = new Menu();
                }
                    CLS = new CLS();
                System.out.println("Enter category (quizzes, labAssignments, projects, exams, attendance):");
                String category = scanner.nextLine().trim();
                CLS = new CLS();

                OutputStreamWriter pw;
                switch (choice) {
                    case 1:
                        CLS = new CLS();
                        System.out.println("Enter grade:");
                        int grade = (int) scanner.nextDouble();
                        Assessment assessment = new Assessment(grade);

                        addToCategory(scoreList, category, assessment);
                        CLS = new CLS();
                        break;

                    case 2:
                        CLS = new CLS();
                        System.out.println("Enter index:");
                        int index = scanner.nextInt();
                        System.out.println("Enter new grade:");
                        double newGrade = scanner.nextDouble();

                        modifyGradeInCategory(scoreList, category, index, newGrade);
                        CLS = new CLS();
                        break;

                    case 3:
                        CLS = new CLS();
                        System.out.println("Enter index:");
                        int removeIndex = scanner.nextInt();

                        removeFromCategory(scoreList, category, removeIndex);
                        CLS = new CLS();
                        break;

                    case 4:
                        //System.out.printf("Final grade: %.2f%n", scoreList.getFinalGrade());
                        clear = 1;
                        CLS = new CLS();
                        //Sleep = new Sleep();
                        System.out.println("Final grade: " + scoreList.getFinalGrade());
                        break;
                }
                
            }

            scanner.close();
        }
    
}

    private static void addToCategory(ScoreList scoreList, String category, Assessment assessment) {
        switch (category) {
            case "quizzes":
                scoreList.getQuizzes().add(assessment);
                break;
            case "labAssignments":
                scoreList.getLabAssignments().add(assessment);
                break;
            case "projects":
                scoreList.getProjects().add(assessment);
                break;
            case "exams":
                scoreList.getExams().add(assessment);
                break;
            case "attendance":
                scoreList.getAttendance().add(assessment);
                break;
        }
    }

    private static void modifyGradeInCategory(ScoreList scoreList, String category, int index, double newGrade) {
        switch (category) {
            case "quizzes":
                scoreList.getQuizzes().get(index).setScore(newGrade);
                break;
            case "labAssignments":
                scoreList.getLabAssignments().get(index).setScore(newGrade);
                break;
            case "projects":
                scoreList.getProjects().get(index).setScore(newGrade);
                break;
            case "exams":
                scoreList.getExams().get(index).setScore(newGrade);
                break;
            case "attendance":
                scoreList.getAttendance().get(index).setScore(newGrade);
        break;
        }
    }
    private static void removeFromCategory(ScoreList scoreList, String category, int index) {
    switch (category) {
        case "quizzes":
            scoreList.getQuizzes().remove(index);
            break;
        case "labAssignments":
            scoreList.getLabAssignments().remove(index);
            break;
        case "projects":
            scoreList.getProjects().remove(index);
            break;
        case "exams":
            scoreList.getExams().remove(index);
            break;
        case "attendance":
            scoreList.getAttendance().remove(index);
            break;
        }
    }
    
}