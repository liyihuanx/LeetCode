import java.util.Arrays;

/**
 * @author liyihuanx
 * @date 2022-06-28 20:20:00
 * @Description [剑指 Offer II 012]左右两边子数组的和相等
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
