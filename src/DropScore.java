import java.util.ArrayList;

public final class DropScore
{
    public static ArrayList<Assessment> dropLowest(ArrayList<Assessment> assessments)
    {
        ArrayList<Assessment> scores = assessments;
        Assessment lowest = scores.get(0);
        int position = 0;

        for (int i = 1; i < scores.size(); i++)
        { 
            if (scores.get(i).getScore() < lowest.getScore())
            {
                lowest = scores.get(i);
                position = i;
            }
        }

        scores.remove(position);
        return scores;
    }
}