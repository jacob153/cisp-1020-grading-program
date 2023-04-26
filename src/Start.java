import java.io.IOException;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) throws IOException {
        //new initialize();
        new CLS();
        ArrayList<ScoreList> scoreList = new ArrayList<>();
        new Menu(scoreList);
    }
}

