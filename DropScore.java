/**
 * Grading Group Project
 * 
 * Drop lowest score from Quizzes & labs
 *
 */
package Grading;

import java.util.ArrayList;

public class DropScore {
    public static ArrayList<Score> dropLowest(ArrayList<Score> scores){
        double lowest = scores.get(0).getScore();
        for (int i = 1; i < scores.size(); i++){
            if (scores.get(i).getScore() < lowest){
                lowest = scores.get(i).getScore();
            }
        }
        int pos = 0;
        boolean found = false;
        while (pos < scores.size() && !found){
            if(scores.get(pos).getScore() == lowest){
                found = true;
            }
            else{
                pos++;
            }
        }
        if(found) {
            scores.remove(pos);
        }
        return scores;
        
        // Quizzes & Labs are 20% grade distribution
    }
        
}
