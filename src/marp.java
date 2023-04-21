import java.util.ArrayList;
import java.util.Scanner;

public class marp {
    public marp(){

        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Assessment> quizzes = new ArrayList<>();
            ArrayList<Assessment> labAssignments = new ArrayList<>();
            ArrayList<Assessment> projects = new ArrayList<>();
            ArrayList<Assessment> exams = new ArrayList<>();
            ArrayList<Assessment> attendance = new ArrayList<>();

            ScoreList scoreList = new ScoreList(quizzes, labAssignments, projects, exams, attendance);

            boolean continueInput = true;

            while (continueInput) {
                System.out.println("1. Add grade");
                System.out.println("2. Modify grade");
                System.out.println("3. Remove grade");
                System.out.println("4. Print final grade");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 5) {
                    continueInput = false;
                    continue;
                }

                System.out.println("Enter category (quizzes, labAssignments, projects, exams, attendance):");
                String category = scanner.nextLine().trim();

                switch (choice) {
                    case 1:
                        System.out.println("Enter grade:");
                        double grade = scanner.nextDouble();
                        Assessment assessment = new Assessment(grade);

                        addToCategory(scoreList, category, assessment);
                        break;

                    case 2:
                        System.out.println("Enter index:");
                        int index = scanner.nextInt();
                        System.out.println("Enter new grade:");
                        double newGrade = scanner.nextDouble();

                        modifyGradeInCategory(scoreList, category, index, newGrade);
                        break;

                    case 3:
                        System.out.println("Enter index:");
                        int removeIndex = scanner.nextInt();

                        removeFromCategory(scoreList, category, removeIndex);
                        break;

                    case 4:
                        //System.out.printf("Final grade: %.2f%n", scoreList.getFinalGrade());
                        System.out.printf("Final grade: " + scoreList.getFinalGrade());
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