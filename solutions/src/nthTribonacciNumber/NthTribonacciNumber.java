package nthTribonacciNumber;

public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else if (n == 2) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1] + dp[i - 3];
        }
        return dp[dp.length - 1];
    }
}
