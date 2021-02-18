public class PrintCalendar {

    public static void Print(int days){

        for (int i = 1; i <= days; i++) {
            if (i % 7 == 0) {
                System.out.format(" %4d", i);
                System.out.println();
            } else {
                System.out.format(" %4d", i);
            }

        }

    }

}
