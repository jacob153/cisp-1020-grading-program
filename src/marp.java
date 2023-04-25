import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class marp {
    /**
     * @param category 
     * @throws IOException
     */
    /*@Override
    public String toString() {
    int TestInt = 5;
    return "" + TestInt;
    }*/
    public marp(String category) throws IOException{
        try (Scanner scanner = new Scanner(System.in)) {
            


            ScoreList scoreList = new ScoreList();
           ArrayList<Student> students = new ArrayList<>();

            //add options for creating new student by recieving Student info

            boolean continueInput = true;

            while (continueInput) {
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
                    new Menu(scoreList);
                }
                    new CLS();
                
                Student = new Student();
                System.out.println("Select a cetegory");
                System.out.println("1. Quizzes");
                System.out.println("2. Lab Assignments");
                System.out.println("3. Projects");
                System.out.println("4. Exams");
                System.out.println("5. Attendance");
                int CategoryNumber = scanner.nextInt();
                if(CategoryNumber == 1){
                    category = "quizzes";
                }else if(CategoryNumber == 2){
                    category = "labAssignments";
                }else if(CategoryNumber == 3){
                    category = "projects";
                }else if(CategoryNumber == 4){
                    category = "exams";
                }else if(CategoryNumber == 5){
                    category = "attendance";
                }else{
                    System.out.println("That is not a category, please try again");
                }
                //System.out.println("Enter category (quizzes, labAssignments, projects, exams, attendance):");
                //String category = scanner.nextLine().trim();
                new CLS();

                switch (choice) {
                    case 1:
                        new CLS();
                        System.out.println("Enter grade:");
                        int grade = (int) scanner.nextDouble();
                        Assessment assessment = new Assessment(grade);

                        addToCategory(scoreList, category, assessment);
                        new CLS();
                        break;

                    case 2:
                        new CLS();
                        System.out.println("Enter index:");
                        int index = scanner.nextInt();
                        System.out.println("Enter new grade:");
                        double newGrade = scanner.nextDouble();

                        modifyGradeInCategory(scoreList, category, index, newGrade);
                        new CLS();
                        break;

                    case 3:
                        new CLS();
                        System.out.println("Enter index:");
                        int removeIndex = scanner.nextInt();

                        removeFromCategory(scoreList, category, removeIndex);
                        new CLS();
                        break;

                    case 4:
                        new CLS();
                        //Sleep = new Sleep();
                        new initialize();
                        System.out.println("Final grade: " + scoreList.getFinalGrade());
                        break;
                    case 5:
                        System.out.println("case 5");
                }
                
            }

            scanner.close();

     

        }
        

        }

    private static void addToCategory(ScoreList scoreList, String category, Assessment assessment) {
        switch (category) {
            case "quizzes":
                scoreList.getQuizzes().add(scoreList.getQuizzes().size(), assessment);
                break;
            case "labAssignments":
                scoreList.getLabAssignments().add(scoreList.getLabAssignments().size(), assessment);
                break;
            case "projects":
                scoreList.getProjects().add(scoreList.getProjects().size(), assessment);
                break;
            case "exams":
                scoreList.getExams().add(scoreList.getExams().size(), assessment);
                break;
            case "attendance":
                scoreList.getAttendance().add(scoreList.getAttendance().size(), assessment);
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

    // public double GPA(){
    //     GPA gpa = new GPA(scoreList);
    //     double calculatedGPA = gpa.calculateGPA();
    //     System.out.println("Calculated GPA: " + calculatedGPA);
    //     System.out.println("Enter 99 to go back");
    //     return calculatedGPA;
    // }
        

    }
    
