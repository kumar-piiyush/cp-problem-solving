// the sum of n arithmetic progression
// if d = 0, it is sum of n consecutive natural numbers

import java.util.*;
public class arthmaticProgression{
    public static int getSum(int n, int d){
        
        int ans;
        int a = 1;
        ans = (n/2)*((2*a+(n-1)*d));
        return ans;
        
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int a = sc.nextInt();
        System.out.print("Enter d: ");
        int d = sc.nextInt();
        
        int ans = getSum(a,d);
        
        System.out.println("The answer is : "+ans);
        
    }
}