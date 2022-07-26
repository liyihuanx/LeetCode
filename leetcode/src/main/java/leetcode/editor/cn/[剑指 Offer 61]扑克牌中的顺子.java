import java.util.HashSet;
import java.util.Set;

/**
 * @author liyihuanx
 * @date 2022-07-26 18:24:25
 * @Description [剑指 Offer 61]扑克牌中的顺子
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);

            if (!repeat.add(nums[i])) {
                return false;
            }
        }

        return max - min < 5;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
