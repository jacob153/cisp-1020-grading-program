import java.util.Scanner;

public class DropLowest {
    private static CLS CLS;
    private static Sleep Sleep;
    public DropLowest(){
        int Exiting = 0;
        Scanner in = new Scanner(System.in);
        while(Exiting < 100){
            CLS = new CLS();
            System.out.println("Comming Soon - Enter 99 to go back");
            Exiting = in.nextInt();
            if(Exiting == 99){
                return;
            }else{
                CLS = new CLS();
                System.out.println("That does not appear to be an option, Please try again.");
                Sleep = new Sleep();
                
            }
        }

    }
    
}
/* 
 * private static DropLowest DropLowest;
 * 
 * DropLowest = new DropLowest();
*/