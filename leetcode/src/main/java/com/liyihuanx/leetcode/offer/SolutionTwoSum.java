package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/04/14
 * @Description 剑指 Offer 57. 和为s的两个数字
 */
class SolutionTwoSum {
//		[16,16,18,24,30,32]
//		48
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					result[0] = nums[i];
//					result[1] = nums[j];
//					break;
//				}
//			}
//		}
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int i = 0;
		int j = nums.length - 1;
		while (i < j) {
			if (nums[i] + nums[j] > target) {
				j = j - 1;
			} else if (nums[i] + nums[j] < target) {
				i = i + 1;
			} else if (nums[i] + nums[j] == target) {
				result[0] = nums[i];
				result[1] = nums[j];
				break;
			}
		}

		return result;
	}

}
