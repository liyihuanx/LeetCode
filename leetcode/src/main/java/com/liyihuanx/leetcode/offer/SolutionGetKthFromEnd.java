package com.liyihuanx.leetcode.offer;

/**
 * @author liyihuan
 * @date 2022/04/01
 * @Description
 */
class SolutionGetKthFromEnd {

	public ListNode getKthFromEnd(ListNode head, int k) {
		ListNode temp = head;
		ListNode result = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}

		while (temp != null) {
			temp = temp.next;
			result = result.next;
		}

		return result;
	}

}
