import java.util.Scanner;

public class GradingMain {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            //Declarations
            int MenuOption = 0;
            boolean StopProgram = false;
            String ML = "========================================================================================";

            //Object Creation
            

            //Main Menu
            while(MenuOption < 100){
            System.out.println("1. View Individual Grades");
            System.out.println("2. View Average Grades");
            System.out.println("3. View GPA");
            System.out.println("4. View All");
            System.out.println("5. Add Grades");
            System.out.println("6. Drop Lowest Score");
            System.out.println("99. Enter 99 to exit");
            System.out.println("Enter the number for the selected option above: ");
            MenuOption = in.nextInt();
                System.out.println(ML);
            if(MenuOption == 1){
                //Option 1 - Viewing Individual Grades
                System.out.println("Viewing Individual Grades");
            }else if(MenuOption == 2){
                //Option 2 - Entering Grades
                System.out.println("Option 2");
            }else if(MenuOption == 3){
                //Option 3 - Dropping Lowest Grades
                System.out.println("Option 3");
            }else if(MenuOption == 4){
                //Option 4 - View All Grade Formats
                System.out.println("Option 4");
            }else if(MenuOption == 5){
                //Option 5 - Add Grades
                System.out.println("Option 5 - Add Grades");
                System.out.println(ML);

            }else if(MenuOption == 6){
                //Option 6 - Drop Lowest Score
                System.out.println("Option 6");
            }else if(MenuOption == 99){
                StopProgram = true;
                break;
            }else{
                System.out.println("That Doesn't appear to be an option please try again");
            }
                System.out.println(ML);
   }
        }
    }

}
