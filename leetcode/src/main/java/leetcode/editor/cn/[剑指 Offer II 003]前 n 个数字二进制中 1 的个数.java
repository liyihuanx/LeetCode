/**
 * @author liyihuanx
 * @date 2022-06-25 17:28:14
 * @Description [剑指 Offer II 003]前 n 个数字二进制中 1 的个数
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] countBits(int n) {
        int[] bit = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            bit[i] = bit[i >> 1] + (i & 1);
        }
        return bit;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
