/**
* the instructor is able to choose which grading schema
* that they want to use
*/
public final class GradeScale
{
    public static String getLetterGrade(int gradingSchema, double score)
    {
        String grade = "";

        switch (gradingSchema) 
        { 
            case 1:
                if (score >= 90) 
                    grade = "A";
                else if(score >= 80) 
                    grade = "B";
                else if(score >= 70) 
                    grade = "C";
                else if(score >= 60) 
                    grade = "D";
                else               
                    grade = "F";
                break;
            case 2:
                if (score >= 90) 
                    grade = "A";
                else if(score >= 80) 
                    grade = "B";
                else if(score >= 70) 
                    grade = "C";
                else if(score >= 65) 
                    grade = "D";
                else                 
                    grade = "F";
                break;
            case 3:
                if (score >= 95) 
                    grade = "A+";
                else if(score >= 90) 
                    grade = "A";
                else if(score >= 85) 
                    grade = "B+";
                else if(score >= 80) 
                    grade = "B";
                else if(score >= 70) 
                    grade = "C";                
                else if(score >= 65) 
                    grade = "D";
                else                 
                    grade = "F";
                break;
        }

        return grade;
    }
}
