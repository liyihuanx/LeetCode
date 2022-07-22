/**
 * @author liyihuanx
 * @date 2022-07-06 19:52:12
 * @Description [剑指 Offer 11]旋转数组的最小数字
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minArray(int[] numbers) {
        int first = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (first > numbers[i]) {
                first = numbers[i];
            }
        }
        return first;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
