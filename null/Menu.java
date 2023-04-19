import java.util.Scanner;
// At the moment, using to test classes, needs more structure
public class Menu {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Declarations
        int MenuOption;

        //Main Menu
        System.out.println("1. View Indevidual Grades");
        System.out.println("2. Enter Grades");
        System.out.println("3. View Grades Average");
        System.out.println("4. Drop Lowest Score");
        System.out.println("Enter the number for the selected option above: ");
        MenuOption = in.nextInt();
        if(MenuOption == 1){
            Grades g1 = new Grades();
            System.out.println(g1);
            
        }else if(MenuOption == 2){
            
        }else if(MenuOption == 3){
            
        }
    }
    
}