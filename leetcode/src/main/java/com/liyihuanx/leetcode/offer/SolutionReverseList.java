package com.liyihuanx.leetcode.offer;


/**
 * @author liyihuan
 * @date 2022/04/01
 * @Description
 */
class SolutionReverseList {
	public ListNode reverseList(ListNode head) {



		ListNode second = head, first = null;
		while(second != null) {
			ListNode tmp = second.next; // 暂存后继节点 second.next
			second.next = first;          // 修改 next 引用指向
			first = second;               // first 暂存 second
			second = tmp;               // second 访问下一节点
		}
		return first;
	}
}
