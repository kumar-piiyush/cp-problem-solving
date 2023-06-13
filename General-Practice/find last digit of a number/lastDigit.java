import java.util.*;

public class lastDigit{

    public static int findLastDigit(int n){        
        return n%10;
    }
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = findLastDigit(n);
        System.out.println("Last digit of the entered number is: "+ans);

    }
}