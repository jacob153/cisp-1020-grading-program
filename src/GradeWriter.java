
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeWriter {
    /**
     * Prints student's grades to file
     * @param scores object holding student scores
     * @throws IOException 
     */
    public static void printGrades(ScoreList scores) throws IOException {
        File file = new File("StudentProfile.txt");
        FileWriter fw = new FileWriter(file, true); //true makes the info stay in the text file
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(scores.getsFirstName() + " " + scores.getsLastName() + " " + scores.getStudentId() + '\n');
        bw.write(arrayToString("Quizzes", scores.getQuizzes()) + '\n'
                + arrayToString("Lab grade", scores.getLabAssignments()) + '\n'
                + arrayToString("Project grade", scores.getProjects()) + '\n'
                + arrayToString("Exams", scores.getExams()) + '\n'
                + arrayToString("Attendance", scores.getAttendance()) + '\n');
        
        bw.close();
        fw.close();  
    }
        /**
         * Changes Assessment to string
         * @param label string name
         * @param listing array list of Assessment
         * @return 
         */
    public static String arrayToString(String label, ArrayList<Assessment>listing){
        String printMe = listing + ":";
        for(Assessment a: listing){
            printMe = printMe + " " + String.valueOf(a.getScore());
        }
        return printMe;
    }
}
