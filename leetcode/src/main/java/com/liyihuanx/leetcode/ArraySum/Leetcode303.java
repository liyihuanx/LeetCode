package com.liyihuanx.leetcode.ArraySum;

/**
 * @author liyihuan
 * @date 2022/02/15
 * @Description 数组前缀和算法,leetcode第303题
 */

class Leetcode303 {
	static int[] nums = {-2, 0, 3, -5, 2, -1};
	static int[] preSum = new int[nums.length + 1];

	public static void main(String[] args) {
		NumArray(nums);
		sumRange(1, 5);
	}

	// [-2, 0, 3, -5, 2, -1
	/* 输入一个数组，构造前缀和 */
	public static void NumArray(int[] nums) {
		// preSum[0] = 0，便于计算累加和
		// 计算 nums 的累加和
		for (int i = 1; i < preSum.length; i++) {
			preSum[i] = preSum[i - 1] + nums[i - 1];
		}
		
	}

	/* 查询闭区间 [left, right] 的累加和 */
	public static int sumRange(int left, int right) {
		int result = preSum[right + 1] - preSum[left];
		System.out.println("结果值为：" + result);
		return preSum[right + 1] - preSum[left];
	}
}
