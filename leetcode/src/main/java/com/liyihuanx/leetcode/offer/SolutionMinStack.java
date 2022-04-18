package com.liyihuanx.leetcode.offer;

import java.util.Stack;

/**
 * @author liyihuan
 * @date 2022/04/07
 * @Description 剑指 Offer 30. 包含min函数的栈
 */
class SolutionMinStack {
	Stack<Integer> first, second;


	public SolutionMinStack() {
		// first 存放所有
		first = new Stack<>();
		// second 存放最后进入的，且最小的
		second = new Stack<>();
	}
	public void push(int x) {
		first.push(x);
		// 如果为空，直接添加
		// 如果顶上的大于x，也存入
		if (second.isEmpty() || second.peek() > x) {
			second.push(x);
		}
	}
	public void pop() {
		//
		if (first.pop().equals(second.peek())) {
			second.pop();
		}
	}
	public int top() {
		return first.peek();
	}
	public int min() {
		return second.peek();
	}

}
