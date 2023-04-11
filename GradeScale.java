/**
 * Grading Group Project
 * 
 * Provide the grade scale guidance
 */

public class GradeScale {
	private int score;
	private String grade;
	
	public GradeScale() {
		if(score >= 90) {
			grade = "A";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 70) {
			grade = "C";
		}
		else if(score >= 60) {
			grade = "D";
		}
		else {
			grade = "F";
		}
	}
}
