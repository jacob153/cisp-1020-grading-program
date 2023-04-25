import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GradeWriter {
    public GradeWriter() throws IOException{
		try (Scanner in = new Scanner(System.in)) {
        }
		File file = new File("Grades.txt");
		try (FileWriter fw = new FileWriter(file, true)) {
        }
		try (PrintWriter pw = new PrintWriter(file)) {
        }
        pw.write(Grade + ", " + sFirstName + ": " + studentId + '\n');
		pw.write("Quiz grade: " + quizGrade + '\n'
				+ "Lab grade: " + labGrade + '\n' 
				+ "Project grade: " + proj + '\n' 
				+ "Exam 1: "+ exam1 + '\n' 
				+ "Exam 2: " + exam2 + '\n' 
				+ "Attendance: " + atten + '\n'
				+ "GPA: " + totalScore + '\n');
		in.close();
		pw.close();
    }
}


/*
 * use this at top of other class
 * private static GradeWriter GradeWriter;
 * 
 * Use this to direct to this class
 * GradeWriter = new GradeWriter();
 */