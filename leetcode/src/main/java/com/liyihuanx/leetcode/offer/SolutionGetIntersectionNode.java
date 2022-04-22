package com.liyihuanx.leetcode.offer;

import com.liyihuanx.leetcode.ListNode;

/**
 * @author liyihuan
 * @date 2022/04/18
 * @Description 剑指 Offer 52. 两个链表的第一个公共节点
 */
class SolutionGetIntersectionNode {
	// headA = [4,1,8,4,5][5,0,1,8,4,5]
	// headB = [5,0,1,8,4,5][4,1,8,4,5]
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode p1 = headA;
		ListNode p2 = headB;
		while (p1 != p2) {
			if (p1 == null) {
				p1 = headB;
			} else {
				p1 = p1.next;
			}
			if (p2 == null) {
				p2 = headA;
			} else {
				p2 = p2.next;
			}
		}
		return p1;
	}

}
