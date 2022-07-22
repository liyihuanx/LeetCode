/**
 * @author liyihuanx
 * @date 2022-07-22 17:16:44
 * @Description [剑指 Offer 53 - I]在排序数组中查找数字 I
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                count = count + 1;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
