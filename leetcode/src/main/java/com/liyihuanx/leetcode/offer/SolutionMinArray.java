package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/03/25
 * @Description 剑指 Offer 11. 旋转数组的最小数字
 */
class SolutionMinArray {
	public int minArray(int[] numbers) {
		int first = numbers[0];
		int second = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (first > numbers[i]) {
				first = numbers[i];
			}
		}
		return first;
	}

}
