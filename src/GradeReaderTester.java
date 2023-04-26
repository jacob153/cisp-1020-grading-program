import java.io.File;
import java.util.ArrayList;

public class GradeReaderTester {
    public static void main(String[] args) {
        File f = new File("f.txt");

        ArrayList<ScoreList> students = GradeReader.readGrades(f);
        for(ScoreList s: students){
        System.out.println(s);
        }

    }
}
