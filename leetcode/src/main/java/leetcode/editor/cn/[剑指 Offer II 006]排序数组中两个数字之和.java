/**
 * @author liyihuanx
 * @date 2022-06-27 20:37:03
 * @Description [剑指 Offer II 006]排序数组中两个数字之和
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;
        int[] result = new int[2];
        while (firstIndex <= lastIndex) {
            if (numbers[firstIndex] + numbers[lastIndex] == target){
                result[0] = firstIndex;
                result[1] = lastIndex;
                break;
            } else if (numbers[firstIndex] + numbers[lastIndex] > target) {
                lastIndex = lastIndex - 1;
            } else if (numbers[firstIndex] + numbers[lastIndex] < target) {
                firstIndex = firstIndex + 1;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
