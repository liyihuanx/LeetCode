import java.util.ArrayList;
import java.util.List;

/**
 * @author liyihuanx
 * @date 2022-07-26 18:42:00
 * @Description [剑指 Offer 57 - II]和为s的连续正数序列
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();

        int start = 1;
        int end = 2;
        int windowSum = 3;
        while (start < end) {
            if (windowSum == target) {
                int[] tmep = new int[end - start + 1];
                for (int i = start; i <= end; i++) {
                    tmep[i - start] = i;
                }
                res.add(tmep);
            }

            if (windowSum < target) {
                end++;
                windowSum += end;
            } else {
                windowSum -= start;
                start++;
            }
        }
        return res.toArray(new int[0][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
