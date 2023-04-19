import java.util.Scanner;

public class GradeDist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter score Quiz 1: ");
        Double quiz1 = in.nextDouble();
        Double quiz1C = quiz1*0.20;
        
        System.out.println("Enter Quiz 2 Score: ");
        Double quiz2 = in.nextDouble();
        Double quiz2C = quiz2*.20;
        
        Double averageQuiz = (quiz1 + quiz2)/2;
        Double weightQuiz = (quiz1C + quiz2C)/2;
        
        System.out.println("Average quiz Score: " + averageQuiz);
        System.out.println("Average quiz weighted: " + weightQuiz);
        
        
    }
    
}