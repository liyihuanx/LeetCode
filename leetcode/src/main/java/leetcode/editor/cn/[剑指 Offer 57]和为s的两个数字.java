/**
 * @author liyihuanx
 * @date 2022-07-26 18:18:08
 * @Description [剑指 Offer 57]和为s的两个数字
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] + nums[right] > target) {
                right -= 1;
            } else if (nums[left] + nums[right] < target) {
                left += 1;
            } else {
                return new int[]{nums[left], nums[right]};
            }


        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
