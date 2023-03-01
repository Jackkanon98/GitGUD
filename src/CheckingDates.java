import java.util.Scanner;

public class CheckingDates {
    public static boolean CheckingDateBounds(Scanner in) {
        while (in.hasNextLine()) {
            Scanner lineScanner = new Scanner(in.nextLine());
            int month = lineScanner.nextInt();
            int day = lineScanner.nextInt();
            int year = lineScanner.nextInt();

            if(month < 1 || month >12){
                return false;
            }
            if(day < )

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
    }
}
