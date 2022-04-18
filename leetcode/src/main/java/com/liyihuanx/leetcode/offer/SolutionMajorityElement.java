package com.liyihuanx.leetcode.offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liyihuan
 * @date 2022/04/11
 * @Description 剑指 Offer 39. 数组中出现次数超过一半的数字
 */
class SolutionMajorityElement {
	HashMap<Integer, Integer> hashMap = new HashMap<>();

	public int majorityElement(int[] nums) {
		for (int num : nums) {
			if (!hashMap.containsKey(num)) {
				hashMap.put(num, 1);
			} else {
				hashMap.put(num, hashMap.get(num) + 1);
			}
		}

		Map.Entry<Integer, Integer> majorityEntry = null;
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
				majorityEntry = entry;
			}
		}

		return majorityEntry.getKey();

	}


	// 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。 一定会有的所以能取这值
	public int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}


}
