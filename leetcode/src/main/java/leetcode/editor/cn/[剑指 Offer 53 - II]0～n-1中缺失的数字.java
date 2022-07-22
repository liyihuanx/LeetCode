/**
 * @author liyihuanx
 * @date 2022-07-22 17:17:27
 * @Description [剑指 Offer 53 - II]0～n-1中缺失的数字
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
