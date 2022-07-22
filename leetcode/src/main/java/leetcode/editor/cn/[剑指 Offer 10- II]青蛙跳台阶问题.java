/**
 * @author liyihuanx
 * @date 2022-07-06 19:28:53
 * @Description [剑指 Offer 10- II]青蛙跳台阶问题
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numWays(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n + 1; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
