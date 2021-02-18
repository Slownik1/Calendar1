import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        Scanner scan = new Scanner(System.in);
        Formatter format = new Formatter();

        int month = scan.nextInt();
        int day31 = 31;
        int day30 = 30;

        switch (month) {

            case 1, 3, 5, 7, 8, 10, 12:

                PrintCalendar.Print(day31);

                break;

            case 4, 6, 9, 11:

                PrintCalendar.Print(day30);

                break;

            case 2:

                if(today.isLeapYear())
                    PrintCalendar.Print(29);
                else
                    PrintCalendar.Print(28);
        }

    }
}
