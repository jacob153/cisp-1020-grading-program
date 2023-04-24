import java.util.Scanner;
public class Menu {
    private static marp marp;
    private static GPA GPA;
    private static CLS CLS;
    private static DropLowest DropLowest;
    private static Sleep Sleep;
    public Menu(){
        try (Scanner in = new Scanner(System.in)) {
            //Declarations
            int MenuOption = 0;
            boolean StopProgram = false;
            String GradeType = "***";
            String ML = "========================================================================================";

            //Object Creation
            

            //Main Menu
            while(MenuOption < 1100){
            CLS = new CLS();
            System.out.println("1. M.A.R.P (Modify, Add, Remove, Print Grades)");
            System.out.println("2. View GPA - Comming Soon");
            System.out.println("3. Drop Lowest Score - Comming Soon");
            System.out.println("99. Enter 99 to exit");
            System.out.println("Enter the number for the selected option above: ");
            MenuOption = in.nextInt();
                System.out.println(ML);
            if(MenuOption == 1){
                //Option 1 - Viewing Individual Grades
                System.out.println("Sending to M.A.R.P");
                System.out.println(ML);
                marp = new marp();
            }else if(MenuOption == 2){
                //Option 2 - View GPA
                System.out.println("Viewing GPA");
                System.out.println("Comming Soon");
                GPA = new GPA();
                System.out.println(ML);

            }else if(MenuOption == 3){
                //Option 3 - Dropping Lowest Grades
                System.out.println("Dropping Lowest Score");
                System.out.println("Comming Soon");
                System.out.println(ML);
                DropLowest = new DropLowest();
            }else if(MenuOption == 99){
                StopProgram = true;
                break;
            }else{
                CLS = new CLS();
                System.out.println("That Doesn't appear to be an option please try again");
                Sleep = new Sleep();
            }
                System.out.println(ML);
            }
        }
    }
    
}
