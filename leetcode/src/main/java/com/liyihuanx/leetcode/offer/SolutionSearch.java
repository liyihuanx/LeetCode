package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/04/18
 * @Description
 */
class SolutionSearch {
	public int search(int[] nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) {
				count = count + 1;
			}
		}
		return count;
	}
}
