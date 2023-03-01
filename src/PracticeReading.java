import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class PracticeReading {
    public static void main(String[] args) throws FileNotFoundException {
        File numbersFile = new File("numbers.txt");
        Scanner in = new Scanner(numbersFile);
        in.useDelimiter("");

        int numsCount = 0;
        boolean inNumber = false;
        boolean hasDecimal = false;
        while(in.hasNext()){
            char c = in.next().charAt(0);

            if(!inNumber && Character.isDigit((c))) {
                //found the start of a new number
                numsCount++;
                inNumber = true;
                hasDecimal = false;
            }else if (inNumber && (Character.isDigit(c) ||
                                   (!hasDecimal && c == '.'))) {
            }
            if (c == '.'){
                hasDecimal = true;
                //currently still in a number
            }else{
                inNumber = false;
                hasDecimal = false;
                //found the end of a number


            }
        }
    }
}
