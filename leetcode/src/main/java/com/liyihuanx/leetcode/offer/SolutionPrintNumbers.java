package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/04/01
 * @Description
 */
class SolutionPrintNumbers {
	public int[] printNumbers(int n) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			count = count * 10;
		}
		int[] result = new int[count-1];

		for (int i = 1; i < count; i++) {
			result[i - 1] = i;
		}
		return result;
	}

}
