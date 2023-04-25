import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeWriter {
    /**
     * Prints student's grades to file
     * @param student from Student class
     * @param quizzes array list of quiz grades
     * @param labAssignments array list of lab assignments
     * @param projects array list of projects
     * @param exams array list of exams
     * @param attendance array list of attendance
     * @throws IOException 
     */
    public static void printGrades(Student student, ArrayList<Assessment> quizzes,
            ArrayList<Assessment> labAssignments, ArrayList<Assessment> projects, ArrayList<Assessment> exams,
            ArrayList<Assessment> attendance) throws IOException {
        File file = new File("StudentProfile.txt");
        FileWriter fw = new FileWriter(file, true); //true makes the info stay in the text file
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write(student.getsFirstName() + " " + student.getsLastName() + " " + student.getStudentId() + '\n');
        bw.write(arrayToString("Quizzes", quizzes) + '\n'
                + arrayToString("Lab grade", labAssignments) + '\n'
                + arrayToString("Project grade", projects) + '\n'
                + arrayToString("Exams", exams) + '\n'
                + arrayToString("Attendance", attendance) + '\n');
        
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
