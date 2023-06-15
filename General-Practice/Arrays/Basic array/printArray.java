import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the " + n +  " elements of the array:");

        //Taking the inputs from the user

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt(); 
        }

        //Printing the array

        System.out.print("Elements of the arrays are: ");

        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
