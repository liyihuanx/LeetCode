/**
 * @author liyihuanx
 * @date 2022-07-19 18:14:02
 * @Description [剑指 Offer 22]链表中倒数第k个节点
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
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }

        while (temp != null) {

            head = head.next;

            temp = temp.next;

        }

        return head;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
