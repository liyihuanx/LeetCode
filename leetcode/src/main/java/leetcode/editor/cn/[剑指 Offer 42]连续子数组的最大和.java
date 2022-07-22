/**
 * @author liyihuanx
 * @date 2022-07-21 18:22:38
 * @Description [剑指 Offer 42]连续子数组的最大和
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
