package com.liyihuanx.leetcode.offer;


import java.util.ArrayList;
import java.util.List;

import sun.security.provider.Sun;

/**
 * @author liyihuan
 * @date 2022/04/14
 * @Description 剑指 Offer 57 - II. 和为s的连续正数序列
 */
class SolutionFindContinuousSequence {
	public int[][] findContinuousSequence(int target) {

//		List<Integer> window = new ArrayList<>();
//		int windowSum = 0;
//		for (int i = 1; i < target; i++) {
//			if (windowSum < target) {
//				window.add(i);
//				windowSum = windowSum + i;
//			} else if (windowSum > target) {
//				int remove = window.remove(0);
//				windowSum = windowSum - remove;
//			} else {
//				int[] arr = new int[window.size()];
//				for (int j = 0; j < window.size(); j++) {
//					arr[j] = window.get(j);
//				}
//				res.add(arr);
//			}
//		}
		List<int[]> res = new ArrayList<>();

		int start = 1;
		int end = 2;
		int windowSum = 3;
		while (start < end) {
			if (windowSum == target) {
				int[] tmep = new int[end - start + 1];
				for (int i = start; i <= end; i++) {
					tmep[i - start] = i;
				}
				res.add(tmep);
			}

			if (windowSum < target) {
				end++;
				windowSum += end;
			} else {
				windowSum -= start;
				start++;
			}
		}
		return res.toArray(new int[0][]);
	}
}
