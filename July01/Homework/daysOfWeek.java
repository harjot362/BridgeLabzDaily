package July01.Homework;

import java.util.*;

public class daysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day); // month-1 because Calendar months are 0-based

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        System.out.println("The day of the week is: " + days[dayOfWeek - 1]);

        sc.close();
    }
}
