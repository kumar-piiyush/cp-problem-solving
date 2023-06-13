import java.util.Scanner;

/**
 * leapYear
 */
public class leapYear {

    public static boolean isLeapYear(int year){

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean ans = isLeapYear(year);
        if (ans==true) {
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }

    }
}