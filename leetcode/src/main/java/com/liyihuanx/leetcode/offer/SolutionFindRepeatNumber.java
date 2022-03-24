package com.liyihuanx.leetcode.offer;

import java.util.HashSet;

/**
 * @author liyihuan
 * @date 2022/03/24
 * @Description 剑指 Offer 03. 数组中重复的数字
 */
class SolutionFindRepeatNumber {

	// [2, 3, 1, 0, 2, 5, 3]
	public int findRepeatNumber(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; i < nums.length; j++) {
				if (nums[i] == nums[j]){
					return nums[i];
				}
			}
		}
		return -1;
	}

	public int findRepeatNumber2(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			if (!set.add(num)) {
				return num;
			}
		}
		return -1;
	}

}
