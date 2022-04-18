package com.liyihuanx.leetcode.offer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author liyihuan
 * @date 2022/04/06
 * @Description 剑指 Offer 40. 最小的k个数
 */
class SolutionGetLeastNumbers {
	public int[] getLeastNumbers(int[] arr, int k) {
		int[] vec = new int[k];
		Arrays.sort(arr);
		for (int i = 0; i < k; ++i) {
			vec[i] = arr[i];
		}
		return vec;
	}
}
