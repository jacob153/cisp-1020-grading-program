import java.util.Scanner;

public class DropLowest {
    public DropLowest(){
        int Exiting = 0;
        try (Scanner in = new Scanner(System.in)) {
            while(Exiting < 100){
                new CLS();
                System.out.println("Comming Soon - Enter 99 to go back");
                Exiting = in.nextInt();
                if(Exiting == 99){
                    return;
                }else{
                    new CLS();
                    System.out.println("That does not appear to be an option, Please try again.");
                    new Sleep();
                    
                }
            }
        }

    }
    
}
/* 
 * private static DropLowest DropLowest;
 * 
 * DropLowest = new DropLowest();
*/