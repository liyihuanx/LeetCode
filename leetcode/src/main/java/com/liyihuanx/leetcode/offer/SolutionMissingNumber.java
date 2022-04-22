package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/04/20
 * @Description
 */
class SolutionMissingNumber {
	public int missingNumber(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i) {
				return i;
			}
		}
		return nums.length == 0 ? 0 : nums.length;
	}

	// 2分法
	public int missingNumber2(int[] nums) {
		int i = 0, j = nums.length - 1;
		while(i <= j) {
			int m = (i + j) / 2;
			if(nums[m] == m) i = m + 1;
			else j = m - 1;
		}
		return i;
	}

}
