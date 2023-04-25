import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    public Menu(ScoreList scores) throws IOException{
        try (Scanner in = new Scanner(System.in)) {
            //Declarations
            int MenuOption = 0;
            String ML = "========================================================================================";

            //Object Creation
            

            //Main Menu
            //new CLS();
            while(MenuOption < 1100){
            //new CLS();
            System.out.println("1. M.A.R.P (Modify, Add, Remove, Print Grades)");
            System.out.println("2. View GPA - Comming Soon");
            System.out.println("3. Drop Lowest Score - Comming Soon");
            System.out.println("4. Read from file");
            System.out.println("5. View Letter Grade");
            System.out.println("99. Enter 99 to exit");
            System.out.println("Enter the number for the selected option above: ");
            MenuOption = in.nextInt();
                System.out.println(ML);
            if(MenuOption == 1){
                //Option 1 - Viewing Individual Grades
                System.out.println("Sending to M.A.R.P");
                System.out.println(ML);
                new CLS();
                new marp(ML);
            }else if(MenuOption == 2){
                //Option 2 - View GPA
                System.out.println("Viewing GPA");
                System.out.println("gpa:"+
                GPA.calculateGPA(scores));
            }else if(MenuOption == 3){
                //Option 3 - Dropping Lowest Grades
                System.out.println("Dropping Lowest Score");
                System.out.println(ML);
                new DropLowest();
            }else if(MenuOption == 4){
                new GradeReader();
            }else if(MenuOption == 5){   
                //Option 5 - Getting Letter Grade
                System.out.println("Input Grading schema 1 - 3: ");
                int schema = in.nextInt(); 
                System.out.println("Letter Grade: " + GradeScale.getLetterGrade(schema, scores.getFinalGrade()));
            }else if(MenuOption == 99){
                break;
            }else{
                new CLS();
                System.out.println("That Doesn't appear to be an option please try again");
                new Sleep();
            }
                System.out.println(ML);
            }
        }
    }
    
}
