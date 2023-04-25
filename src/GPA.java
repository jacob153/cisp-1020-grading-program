

public class GPA {




public static double calculateGPA(ScoreList scores) {
    double finalGrade = scores.getFinalGrade();
    if (finalGrade >= 90.0) {
        return 4.0;
    } else if (finalGrade >= 80.0) {
        return 3.0;
    } else if (finalGrade >= 70.0) {
        return 2.0;
    } else if (finalGrade >= 60.0) {
        return 1.0;
    } else {
        return 0.0;
    }
}
}