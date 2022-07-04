package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/04/02
 * @Description 剑指 Offer 18. 删除链表的节点
 */
class SolutionDeleteNode {
	public ListNode deleteNode(ListNode head, int val) {
		// 4,5,1,9

		if (head.val == val) {
			return head.next;
		}

		ListNode temp = head;
		ListNode cur = head.next;

		while (cur != null && cur.val != val) {
			// 记录当前
			temp = cur;
			// 前进一步
			cur = cur.next;
		}
		// 相等了，跳出while
		if (cur != null) {
			temp.next = cur.next;
		}
		return head;


	}

}
