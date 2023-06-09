import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BrandeGradingMain {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		File file = new File("StudentProfile.txt");
		FileWriter fw = new FileWriter(file, true); //true makes the info stay in the text file
		PrintWriter pw = new PrintWriter(file);
		
		System.out.println("Please enter student's last name: ");
		String sLastName = in.next();
		System.out.println("Please enter student's first name: ");
		String sFirstName = in.next();
		System.out.println("Please enter student's ID number: ");
		String studentId = in.next();
		System.out.println("Please enter grade for Quiz 1: ");
		double quiz1 = in.nextDouble();
		System.out.println("Please enter grade for Quiz 2: ");
		double quiz2 = in.nextDouble();
		System.out.println("Please enter grade for Quiz 3: ");
		double quiz3 = in.nextDouble();
		System.out.println("Please enter grade for Quiz 4: ");
		double quiz4 = in.nextDouble();
		System.out.println("Please enter grade for Quiz 5: ");
		double quiz5 = in.nextDouble();
		double quizGrade = ((quiz1 + quiz2 + quiz3 + quiz4 + quiz5) / 500) * 100;
		double quizTotal = ((quiz1 + quiz2 + quiz3 + quiz4 + quiz5) / 500) * .20;
		
		System.out.println("Please enter grade for Lab Assignment 1: ");
		double lab1 = in.nextDouble();
		System.out.println("Please enter grade for Lab Assignment 2: ");
		double lab2 = in.nextDouble();
		System.out.println("Please enter grade for Lab Assignment 3: ");
		double lab3 = in.nextDouble();
		System.out.println("Please enter grade for Lab Assignment 4: ");
		double lab4 = in.nextDouble();
		System.out.println("Please enter grade for Lab Assignment 5: ");
		double lab5 = in.nextDouble();
		double labGrade = ((lab1 + lab2 + lab3 + lab4 + lab5) / 500) * 100;
		double labTotal = ((lab1 + lab2 + lab3 + lab4 + lab5) / 500) * .20;
		
		System.out.println("Please enter grade for the Project: ");
		double proj = in.nextDouble();
		double projTotal = (proj / 100) * .10;
		
		System.out.println("Please enter grade for the Exam 1: ");
		double exam1 = in.nextDouble();
		double exam1Tot = (exam1 / 100) * .20;
		System.out.println("Please enter grade for the Exam 2: ");
		double exam2 = in.nextDouble();
		double exam2Tot = (exam2 / 100) * .20;
		
		System.out.println("Please enter grade for Attendance: ");
		double atten = in.nextDouble();
		double attenTotal = (atten / 100) * .10;
		
		double totalScore = (quizTotal + labTotal + projTotal +exam1Tot + exam2Tot + attenTotal) * 100;
		
		System.out.println("Weighted Percents:" + " " + quizTotal + " " +labTotal + " " + projTotal  + " " +exam1Tot  + " " + exam2Tot  + " " + attenTotal);
		
		System.out.println("Quiz 1: " + quiz1 + "%");
		System.out.println("Quiz 2: " + quiz2 + "%");
		System.out.println("Quiz 3: " + quiz3 + "%");
		System.out.println("Quiz 4: " + quiz4 + "%");
		System.out.println("Quiz 5: " + quiz5 + "%");
		System.out.println(" Final Quiz grade: " + quizGrade + "%");
		
		System.out.println("Lab 1: " + lab1 + "%");
		System.out.println("Lab 2: " + lab2 + "%");
		System.out.println("Lab 3: " + lab3 + "%");
		System.out.println("Lab 4: " + lab4 + "%");
		System.out.println("Lab 5: " + lab5 + "%");
		System.out.println(" Final Lab grade: " + labGrade + "%");
		
		System.out.println("Project: " + proj + "%");
		System.out.println(" Final Project grade: " + proj + "%");
		
		System.out.println("Exam 1: " + exam1 + "%");
		System.out.println(" Final Exam 1 grade: " + exam1 + "%");
		
		System.out.println("Exam 2: " + exam2 + "%");
		System.out.println(" Final Exam 2 grade: " + exam2 + "%");
		
		System.out.println("Attendance: " + atten + "%");
		System.out.println(" Final Attendance grade: " + atten + "%");
		
		System.out.println("Student: " + sLastName + ", " + sFirstName + "  " + studentId + ":  " + "GPA is: " + totalScore);
		pw.write(sLastName + ", " + sFirstName + ": " + studentId + '\n');
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
/*
         public static void main(String[] args) throws FileNotFoundException {
        
        String text = readString("StudentProfile.txt");
        System.out.println(text);
        
        public static String readString(String file) {
        String text = "";
        try{
            Scanner s = new Scanner(new File(file));
        while (s.hasNextLine()){
        text = text + s.nextLine()+ " ";}
        }
        catch(FileNotFoundException e){
        System.out.println("Error"};
        return text;
        */      
    
}
