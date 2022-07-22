/**
 * @author liyihuanx
 * @date 2022-07-18 20:31:03
 * @Description [剑指 Offer II 088]爬楼梯的最少成本
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];

    }
}
//leetcode submit region end(Prohibit modification and deletion)
