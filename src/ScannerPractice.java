import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args)throws FileNotFoundException {
        File inputFile = new File("scores.txt");
        Scanner fileReader = new Scanner(inputFile);

        while(fileReader.hasNextLine()){
            // for each student record read name then scores
            String name = fileReader.next();
            double total = 0.0;
            int numScores = 0;
            while (fileReader.hasNextDouble()) {
                total += fileReader.nextDouble();
            }
            // print out the student info
            System.out.printf("%s %.2f\n",name, total/numScores);
        }
    }
}
