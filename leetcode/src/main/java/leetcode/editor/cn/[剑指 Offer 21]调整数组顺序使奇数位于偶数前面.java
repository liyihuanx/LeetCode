/**
 * @author liyihuanx
 * @date 2022-07-06 20:48:18
 * @Description [剑指 Offer 21]调整数组顺序使奇数位于偶数前面
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, tmp;
        while(i < j) {
            // 从前往后找偶数
            while(i < j && (nums[i] % 2) == 1) i++;
            // 从后往前找奇数
            while(i < j && (nums[j] % 2) == 0) j--;
            // 交换
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
