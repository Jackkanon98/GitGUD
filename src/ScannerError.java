import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerError {
    public static void main(String[] args) {
        // Create a new scanner that reads from System.in (console input)
        Scanner scan = new Scanner(System.in);
        // Read the next line from that input source
        System.out.println("Enter Move: ");
        try{
            int move = scan.nextInt();
            // Print the line you just read
            System.out.println(move);
        }catch (InputMismatchException e){
            scan.nextLine();// discard bad user input
            System.out.println("I said enter an integer . . .You have one more chance");
            try{
                int move = scan.nextInt();
            }catch (InputMismatchException ex) {
                System.out.println("That's it we're done here ");
            }

        }


    }
}
