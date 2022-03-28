package com.liyihuanx.leetcode.offer;


import com.liyihuanx.leetcode.ListNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author liyihuan
 * @date 2022/03/25
 * @Description 剑指 Offer 06. 从尾到头打印链表
 */

class SolutionReversePrint {
	public int[] reversePrint(ListNode head) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while(head != null) {
			stack.addLast(head.val);
			head = head.next;
		}
		int[] res = new int[stack.size()];
		for(int i = 0; i < res.length; i++)
			res[i] = stack.removeLast();
		return res;
	}
}
