import java.util.Scanner;

/**
 * leapYear
 */
public class leapYear {

    public static boolean isLeapYear(int year){

        if ((year%4)==0) return true;
        else if((year%400)==0) return true;
        else if((year%100)==0) return false;
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