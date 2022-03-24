package com.liyihuanx.leetcode.ArraySum;

/**
 * @author liyihuan
 * @date 2022/02/21
 * @Description
 */
class Leetcode304 {
	private static int[][] preSum;

	//    二维数组
//	[3,0,1,4,2]
//	[5,6,3,2,1]
//	[1,2,0,1,5]
//	[4,1,0,1,7]
//	[1,0,3,0,5]
	public static void main(String[] args) {

	}


	public static void NumMatrix(int[][] matrix) {
//		int m = matrix.length, n = matrix[0].length;
//		if (m == 0 || n == 0) return;
//		// 构造前缀和矩阵
//		preSum = new int[m + 1][n + 1];
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				// 计算每个矩阵 [0, 0, i, j] 的元素和
//				preSum[i][j] = preSum[i-1][j] + preSum[i][j-1] + matrix[i - 1][j - 1] - preSum[i-1][j-1];
//			}
//		}

		int m = matrix.length;
		if (m > 0) {
			int n = matrix[0].length;
			preSum = new int[m + 1][n + 1];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					preSum[i + 1][j + 1] = preSum[i][j + 1] + preSum[i + 1][j] - preSum[i][j] + matrix[i][j];
				}
			}
		}

	}


	public int sumRegion(int row1, int col1, int row2, int col2) {
//		return preSum[row2+1][row2+1] - preSum[row1][col2+1] - preSum[row2+1][col1] + preSum[row1][col1];
		return preSum[row2 + 1][col2 + 1] - preSum[row1][col2 + 1] - preSum[row2 + 1][col1] + preSum[row1][col1];
	}
}
