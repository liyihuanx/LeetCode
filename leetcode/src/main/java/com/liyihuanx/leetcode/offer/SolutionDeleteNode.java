package com.liyihuanx.leetcode.offer;

import com.liyihuanx.leetcode.ListNode;

import java.util.List;

/**
 * @author liyihuan
 * @date 2022/04/02
 * @Description 剑指 Offer 18. 删除链表的节点
 */
class SolutionDeleteNode {
	public ListNode deleteNode(ListNode head, int val) {
		// 4,5,1,9

//		if (head.val == val) {
//			return head.next;
//		}
//		ListNode temp = new ListNode(0);
//		ListNode cur = head.next;
//
//		while (cur.next != null) {
//			if (cur.val != val) {
//				temp = cur;
//				cur = cur.next;
//			}
//		}



		if(head.val == val) return head.next;
		ListNode pre = head, cur = head.next;
		while(cur != null && cur.val != val) {
			pre = cur;
			cur = cur.next;
		}
		if(cur != null) pre.next = cur.next;
		return head;

	}

}
