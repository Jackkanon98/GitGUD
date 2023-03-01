import java.io.IOException;
import java.util.Scanner;
import java.net.URL;

public class CountChars {
    public static void main(String[] args) throws IOException {
        String address = "https://www.google.com";
        URL url = new URL(address);
        Scanner in = new Scanner(url.openStream());
        in.useDelimiter("");
        int letter = 0;
        int digit = 0;
        int whtSpace = 0;
        while(in.hasNext()){
            char b = in.next().charAt(0);
            if(Character.isLetter(b)){
                letter++;
            }
            else if(Character.isDigit(b)){
                digit++;
            }
            else if(Character.isWhitespace(b)){
                whtSpace++;
            }
        }
        System.out.println(digit +" "+  whtSpace +" "+ letter);

        // you can make the output better by putting it in the system.out and labeling and putting them on seperate lines
        // TODO: count character types
        // TODO: print results to System.out

    }
}
