package ForLoop;

public class FibonacciBottumUp {public static void main(String[] args) {
    int n = 50;
    long dp[] = new long[n + 1]; 
    long startTime = System.nanoTime(); 
    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i < n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
        System.out.print(dp[i] + " ");
    }

    long endTime = System.nanoTime();
      System.out.println("\nExecution Time: " + (endTime - startTime) / 1_000_000 + " ms");
}

}
