package ForLoop; 
import java.util.*;
public class FibonacciTopdown 
{
	  public static long fib(int n, long dp[]) {
          if (n <= 1) return n;
          if (dp[n] != -1) return dp[n]; 
          
          dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
          return dp[n];
      }
  
      public static void main(String[] args) {
          int n = 50; 
          long dp[] = new long[n + 1];
          Arrays.fill(dp, -1); 
          long startTime = System.currentTimeMillis(); 
          System.out.print("Fibonacci Series: ");
          for (int i = 0; i < n; i++) {
              System.out.print(fib(i, dp) + " ");
          }
  
          long endTime = System.currentTimeMillis(); 
        System.out.println("\nExecution Time: " + (endTime - startTime) + " ms");
      }
}
