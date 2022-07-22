/**
 * @author liyihuanx
 * @date 2022-07-06 20:46:06
 * @Description [剑指 Offer 18]删除链表的节点
 */

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
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
//leetcode submit region end(Prohibit modification and deletion)
