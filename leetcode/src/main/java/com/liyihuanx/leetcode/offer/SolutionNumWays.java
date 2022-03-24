package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/03/24
 * @Description 剑指 Offer 10- II. 青蛙跳台阶问题
 */
class SolutionNumWays {
	public int numWays(int n) {

		int a = 0, b = 1, sum;
		for(int i = 0; i < n + 1; i++){
			sum = (a + b) % 1000000007;
			a = b;
			b = sum;
		}
		return a;

	}
}
