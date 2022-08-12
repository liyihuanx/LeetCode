/**
 * @author liyihuanx
 * @date 2022-07-27 18:42:19
 * @Description [剑指 Offer 04]二维数组中的查找
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int lie = matrix.length;
        int hang = matrix[0].length;

        int i = 0;
        int j = hang - 1;

        while (i < lie && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
