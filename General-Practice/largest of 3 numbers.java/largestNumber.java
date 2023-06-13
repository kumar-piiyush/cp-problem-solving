import java.util.Scanner;

/**
 * largestNumber
 */
public class largestNumber {

    public static int findLargestNumber(int num1, int num2, int num3){

        int largest = num3;

        if (num1>num2 && num1>num3) {
            largest = num1;
        }else if (num2>num1 && num2>num3) {
            largest = num2;
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println("Enter 3 numbers to be compared: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int ans = findLargestNumber(num1,num2,num3);

        System.out.println("The largest amoung the above 3 entered number is: "+ans);
    }
}