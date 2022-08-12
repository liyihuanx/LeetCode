/**
 * @author liyihuanx
 * @date 2022-08-03 18:59:02
 * @Description [剑指 Offer 16]数值的整数次方
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        if (n == Integer.MIN_VALUE) {
            return myPow(1 / x, -(n + 1)) / x;
        }

        if (n < 0) {
            // 小于0，取倒数，就可以换成正整数计算
            return myPow(1 / x, -n);
        }

        if (n % 2 == 1) {
            return (x * myPow(x, n - 1));
        } else {
            // k 是偶数
            double sub = myPow(x, n / 2);
            return (sub * sub);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
