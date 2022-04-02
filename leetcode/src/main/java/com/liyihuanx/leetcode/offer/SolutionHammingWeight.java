package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/03/30
 * @Description 剑指 Offer 15. 二进制中1的个数
 */
class SolutionHammingWeight {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {

		// n & 1 = 0 则二进制最右一个数为0
		// n & 1 = 1 则二进制最右一个数为1
		int res = 0;
		while(n != 0) {
			res += n & 1;
			// 右移动一位
			n >>>= 1;
		}
		return res;
	}

}
