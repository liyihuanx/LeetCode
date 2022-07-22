import java.util.HashSet;

/**
 * @author liyihuanx
 * @date 2022-07-06 19:17:08
 * @Description [剑指 Offer 03]数组中重复的数字
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
