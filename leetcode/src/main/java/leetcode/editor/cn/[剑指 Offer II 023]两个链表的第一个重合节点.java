/**
 * @author liyihuanx
 * @date 2022-06-29 18:10:53
 * @Description [剑指 Offer II 023]两个链表的第一个重合节点
 */

//leetcode submit region begin(Prohibit modification and deletion)




/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while (nodeA != nodeB) {
            if (nodeA == null) {
                nodeA = headB;
            } else {
                nodeA = nodeA.next;
            }

            if (nodeB == null) {
                nodeB = headA;
            } else {
                nodeB = nodeB.next;
            }
        }
        return nodeA;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
