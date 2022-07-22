/**
 * @author liyihuanx
 * @date 2022-07-12 20:28:12
 * @Description [剑指 Offer II 072]求平方根
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right= mid - 1;
            }
        }

        return ans;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
