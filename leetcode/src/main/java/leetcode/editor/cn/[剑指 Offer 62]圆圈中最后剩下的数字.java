/**
 * @author liyihuanx
 * @date 2022-07-26 18:31:25
 * @Description [剑指 Offer 62]圆圈中最后剩下的数字
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lastRemaining(int n, int m) {
        int pos = 0; // 最终活下来那个人的初始位置
        for(int i = 2; i <= n; i++){
            pos = (pos + m) % i;  // 每次循环右移
        }
        return pos;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
