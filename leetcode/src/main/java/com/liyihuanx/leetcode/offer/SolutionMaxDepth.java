package com.liyihuanx.leetcode.offer;

import com.liyihuanx.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author liyihuan
 * @date 2022/04/13
 * @Description  剑指 Offer 55 - I. 二叉树的深度
 */
class SolutionMaxDepth {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int count = 1;
		count = count + Math.max(maxDepth(root.left),maxDepth(root.right));
		return count;

//		Queue<TreeNode> queue = new LinkedList<>();
//		queue.offer(root);
//		int count = 0;
//		while (!queue.isEmpty()) {
//			count = count + 1;
//			for (int i = 1; i <= queue.size(); i++) {
//				TreeNode node = queue.poll();
//				if (node.left != null) {
//					queue.offer(node.left);
//				}
//
//				if (node.right != null) {
//					queue.offer(node.right);
//				}
//			}
//
//		}
//
//		return count;
	}
}
