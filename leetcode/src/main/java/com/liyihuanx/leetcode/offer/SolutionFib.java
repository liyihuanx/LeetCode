package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/03/23
 * @Description 剑指 Offer 10- I. 斐波那契数列
 */
class SolutionFib {

	//	F(0) = 0,   F(1) = 1
	//	F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
//	public int fib(int n) {
//		if (n == 0) return 0;
//		if (n == 1) return 1;
//
//		int result = fib(n - 1) + fib(n - 2);
//
//		return result;
//	}


	public int fib(int n) {
		int a = 0, b = 1, sum;
		for(int i = 0; i < n; i++){
			sum = (a + b) % 1000000007;
			a = b;
			b = sum;
		}
		return a;
	}
}
