


package Mathematics;
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            if (month == 2) {
                int year = sc.nextInt();
                if (isLeap(year)) {
                    System.out.println("no of days = 29");
                } else {
                    System.out.println("no of days = 28");
                }
            } else if (is31DayMonth(month)) {
                System.out.println("no of days = 31");
            } else { 
                System.out.println("no of days = 30");
            }
        } else {
            System.out.println("invalid input");
        }
        sc.close();
    }


    private static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    private static boolean is31DayMonth(int month) {
        return month == 1 || month == 3 || month == 5 || month == 7
            || month == 8 || month == 10 || month == 12;
    }
}