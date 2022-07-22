/**
 * @author liyihuanx
 * @date 2022-07-21 17:27:16
 * @Description [剑指 Offer 29]顺时针打印矩阵
 */

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {

        if (matrix.length == 0) return new int[0];
        // 上下左右边界
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        // 返回的数组当前的下标
        int index = 0;
        // 返回的数组
        int[] result = new int[(right + 1) * (bottom + 1)];

        while (true) {
            // 从左到右
            for (int i = left; i <= right; i++) {
                result[index] = matrix[top][i];
                index += 1;
            }
            // 然后第一行结束，top移动第二行，下面都是同一个思路
            if (++top > bottom) break;

            // 上到下
            for (int i = top; i <= bottom; i++) {
                result[index] = matrix[i][right];
                index += 1;
            }
            if (left > --right) break;

            // 右到左
            for (int i = right; i >= left; i--) {
                result[index] = matrix[bottom][i];
                index += 1;
            }

            if (top > --bottom) break;

            // 下到上
            for (int i = bottom; i >= top; i--) {
                result[index] = matrix[i][left];
                index += 1;
            }

            if (++left > right) break;

        }


        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
