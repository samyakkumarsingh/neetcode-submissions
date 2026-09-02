class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        Integer[] dp = new Integer[n + 1];

        return solve(cost, n, dp);
    }

    public int solve(int[] cost, int n, Integer[] dp) {

        if (n <= 1) {
            return 0;
        }

        if (dp[n] != null) {
            return dp[n];
        }

        dp[n] = Math.min(
            cost[n - 1] + solve(cost, n - 1, dp),
            cost[n - 2] + solve(cost, n - 2, dp)
        );

        return dp[n];
    }
}