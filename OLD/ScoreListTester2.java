import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;


public class ScoreListTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Assessment> quizzes = new ArrayList<>();
        ArrayList<Assessment> labAssignments = new ArrayList<>();
        ArrayList<Assessment> projects = new ArrayList<>();
        ArrayList<Assessment> exams = new ArrayList<>();
        ArrayList<Assessment> attendance = new ArrayList<>();
        ArrayList<Student> student1 = new ArrayList<>();
        ArrayList<Student> student2 = new ArrayList<>();



        System.out.println("Input Student object info. First, Last, ID");
        student1 = new Student<scanner.next(), scanner.next(), scanner.nextInt()>;
        System.out.println("Input 5 quiz grades.");
        quizzes1 = new ArrayList<>(15,56,87,44,14);
        System.out.println("Input 5 lab Assignments grades.");
        labAssignments1 = new ArrayList<>(5,6,7,4,4);
        System.out.println("Input 1 project grade.");
        projects1 = new ArrayList<>(4);
        System.out.println("Input 2 Exam.");
        exams1 = new ArrayList<>(5,4);
        System.out.println("Input 1 attendance grade.");
        attendance1 = new ArrayList<>(100);

        ScoreList scoreList1 = new ScoreList(quizzes, labAssignments, projects, exams, attendance);

        System.out.println("Input Student object info. First, Last, ID");
        student2 = new Student<scanner.next(), scanner.next(), scanner.nextInt()>;
        System.out.println("Input 5 quiz grades.");
        quizzes2 = new ArrayList<>(15,56,87,44,14);
        System.out.println("Input 5 lab Assignments grades.");
        labAssignments2 = new ArrayList<>(5,6,7,4,4);
        System.out.println("Input 1 project grade.");
        projects2 = new ArrayList<>(4);
        System.out.println("Input 2 Exam.");
        exams2 = new ArrayList<>(5,4);
        System.out.println("Input 1 attendance grade.");
        attendance2 = new ArrayList<>(100);

        ScoreList scoreList2 = new ScoreList(quizzes, labAssignments, projects, exams, attendance);
        
        Map<ArrayList<Student>, ArrayList<Assessment>> student11 = new TreeMap<>();
        Map<ArrayList<Student>, ArrayList<Assessment>> student22 = new TreeMap<>();
        
        student11.put(new ArrayList<>(Arrays.asList(new Student[]{new Student(student1), new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(quizzes1)})),
            new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(labAssignments1)})), new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(projects1)})),
                new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(exams1)})), new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(attendance1)}))})));

        student22.put(new ArrayList<>(Arrays.asList(new Student[]{new Student(student2), new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(quizzes2)})),
            new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(labAssignments2)})), new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(projects2)})),
                new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(exams2)})), new ArrayList<>(Arrays.asList(new Assessment[] {new Assessment(attendance2)}))})));        

        boolean continueInput = true;
        while (continueInput == true) {
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
                    System.out.printf("Final grade: %.2f%n", scoreList.getFinalGrade());
                    break;
            }
        }

        scanner.close();
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