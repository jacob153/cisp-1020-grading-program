/**
 * Grading Group Project
 * 
 * Total & average scores
 *
 */
public class TotScore {
	private double sum;
	private double total;
	
	public TotScore() {
	}
	
	/**
	 * @param sum
	 * @param total
	 */
	public TotScore(double sum, double total) {
		this.sum = sum;
		this.total = total;
	}

	/**
	 * @param sum the sum to set
	 */
	public void setSum(double sum) {
		this.sum = sum;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the sum
	 */
	public double getSum() {
		return sum;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	
	// Quizzes & Labs are 20% each of grade distribution
	// Project & Attendance are 10% each of grade distribution
	// Exam 1 & 2 are 20% each of grade distribution
}
