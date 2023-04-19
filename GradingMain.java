import java.util.Scanner;
// At the moment, using to test classes, needs more structure
public class GradingMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Declarations
        int MenuOption;

        //Main Menu
        System.out.println("1. Enter Grades");
        System.out.println("2. View Grades Average");
        System.out.println("Enter the number for the selected option above");
        MenuOption = in.nextInt();
        if(MenuOption == 1){
            System.out.println("option 1 selected");
        }else if(MenuOption == 2){
            System.out.println("option 2 selected");
        }
    }
    
}


/*   POTENTIAL OLD
 * System.out.println("Please enter the grade: ");
            in.nextDouble();
            while(){
                
            }
            in.close();
 */