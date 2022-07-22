/**
 * @author liyihuanx
 * @date 2022-07-06 20:44:31
 * @Description [剑指 Offer 17]打印从1到最大的n位数
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] printNumbers(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            count = count * 10;
        }
        int[] result = new int[count-1];

        for (int i = 1; i < count; i++) {
            result[i - 1] = i;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
