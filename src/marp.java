import java.io.IOException;
import java.util.ArrayList;
//import java.util.NoSuchElementException;
import java.util.Scanner;
//import java.util.Locale.Category;

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
    public marp(ArrayList<ScoreList> scoreList) throws IOException{
        
        //ArrayList<ScoreList> scoreList = new ArrayList<>();
        

            //add options for creating new student by recieving Student info

            boolean continueInput = true;
            while (continueInput) {
            Scanner scanner = new Scanner(System.in);
                try{
                    //if(clear == 0){
                    //    CLS = new CLS();
                    //}
                    // int choice =0;
                    //scanner.nextLine();
                    System.out.println("1. Add grade");
                    System.out.println("2. Modify grade");
                    System.out.println("3. Remove grade");
                    System.out.println("4. Print final grade");
                    System.out.println("5. Add Student");
                    System.out.println("99. Back to Main Menu");
                    int Ichoice = scanner.nextInt();
                    // System.out.println("");

                //     while(file.hasNext()){
                //         if(file.next().equals(treasure)){
                //              foundTreasure = true;
                //              break; // found treasure, if you need to use it, assign to variable beforehand
                //         }
                //    }
                    if (Ichoice == 99) {
                        System.out.println("pre choice 99");
                        new Menu(scoreList);
                        System.out.println("after choice 99");


                    }
                        new CLS();
                    
                    
                    //System.out.println("Enter category (quizzes, labAssignments, projects, exams, attendance):");
                    //String category = scanner.nextLine().trim();
                    new CLS();
                    
                    int index;
                    String category = "";
                    switch (Ichoice) {
                        case 1:
                            new CLS();
                            index = getStudentIndex(scoreList);
                            category = getCategory(scanner);
                            System.out.println("Enter grade:");
                            double grade = (double) scanner.nextDouble();
                            Assessment assessment = new Assessment(grade);
                            addToCategory(scoreList.get(index), category, assessment);
                            new CLS();
                            break;

                        case 2:
                            new CLS();

                            index = getStudentIndex(scoreList);

                            category = getCategory(scanner);
                            
                            printCategoryGrades(scoreList.get(index), category);
                            System.out.println("Enter index:");
                            int gradeIndex = scanner.nextInt();
                            System.out.println("Enter new grade:");
                            double newGrade = scanner.nextDouble();

                            modifyGradeInCategory(scoreList.get(index), category, gradeIndex, newGrade);
                            new CLS();
                            break;

                        case 3:
                            new CLS();
                             index = getStudentIndex(scoreList);

                            category = getCategory(scanner);
                            System.out.println("Enter index of grade to remove:");
                            int removeIndex = scanner.nextInt();

                            removeFromCategory(scoreList.get(index), category, removeIndex);
                            new CLS();
                            break;

                        case 4:
                            new CLS();
                            //Sleep = new Sleep();
                            index = getStudentIndex(scoreList);
                            System.out.println("Final grade: " + scoreList.get(index).getFinalGrade());
                            break;
                        case 5:
                            //Add Student
                            //scanner.close();
                            scoreList.add(NewStudent(scanner));
                
                            break;
                        default: 
                            System.out.println("Invalid Choice Try Again.");
                    }
             
                
            }catch(Exception e){
                scanner.close();
                throw e;
            }
                // }  catch (NoSuchElementException i) {
                //     System.out.println("something went wrong" + i.getStackTrace() + i.getMessage());
                //     // continueInput = false;
                // }catch (Exception i) {
                //     System.out.println("something went wrong" + i.getStackTrace() + i.getMessage());
                //     // continueInput = false;
                // }
        
            }
        

    }
    public static void printCategoryGrades(ScoreList scorelist, String category){
        ArrayList<Assessment> assessments = new ArrayList<>();
        if(category.equals("quizzes")){
            assessments = scorelist.getQuizzes();
        }else if(category.equals("labAssesments")){
            assessments = scorelist.getLabAssignments();
        }else if(category.equals("exams")){
            assessments = scorelist.getLabAssignments();
        }else if(category.equals("projects")){
            assessments = scorelist.getProjects();
        }else if(category.equals("attendance")){
            assessments = scorelist.getAttendance();
        }
        int i = 0;
        for(Assessment A : assessments){
            System.out.println(i + ". " + A.getScore());
            i++;
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
    public static int getStudentIndex(ArrayList<ScoreList> scoreList){
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        try{
            System.out.println("Select a student by name");
            int i = 0;
            for(ScoreList s: scoreList){
                System.out.println(i + ". " + s.getsFirstName() + " " + s.getsLastName());
                i++;
            }
            index = scanner.nextInt();
            
            //scanner.close();
        }catch(Exception e){
            scanner.close();
        }return index;
    }

    public static String getCategory(Scanner scanner){
        System.out.println("Select a cetegory");
        System.out.println("1. Quizzes");
        System.out.println("2. Lab Assignments");
        System.out.println("3. Projects");
        System.out.println("4. Exams");
        System.out.println("5. Attendance");
        int CategoryNumber = 0;
        String category = "";
        // Scanner scanner = new Scanner(System.in);
        try{
            
            CategoryNumber = scanner.nextInt();
            
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
            // scanner.close();
        }catch(Exception e){
            scanner.close();
            throw e;
        }
            return category;
        
    }
    
    public static ScoreList NewStudent(Scanner StudentScanner){
        // Scanner StudentScanner = new Scanner(System.in);
        ScoreList scorelist = null;
        try{
            System.out.println("Enter students first name:");
            //String sFirstName = System.console().readLine();
             String sFirstName = StudentScanner.next();
            System.out.println("Enter students last name:");
           // String sLastName = System.console().readLine();
             String sLastName = StudentScanner.next();
            System.out.println("Enter students ID number");
            //int ID = 0;
             int ID = StudentScanner.nextInt(); 
            scorelist = new ScoreList(sFirstName, sLastName, ID);
            //StudentScanner.close();
        }catch(Exception e){
            StudentScanner.close();
            throw e;
        }return scorelist;
    }

    // public double GPA(){
    //     GPA gpa = new GPA(scoreList);
    //     double calculatedGPA = gpa.calculateGPA();
    //     System.out.println("Calculated GPA: " + calculatedGPA);
    //     System.out.println("Enter 99 to go back");
    //     return calculatedGPA;
    // }
        

    }
    
