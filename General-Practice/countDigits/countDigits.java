import java.util.Scanner;

public class countDigits {

    public static int countDigit(int n){

        int i = 1;

        while (n>10){

            n= n/10;
            i++;

        }



        return i;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int ans = countDigit(n);

        System.out.println("The input integer has "+ans+" digits.");

    }
}
