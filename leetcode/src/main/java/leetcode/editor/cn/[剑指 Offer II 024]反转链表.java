/**
 * @author liyihuanx
 * @date 2022-06-29 18:52:05
 * @Description [剑指 Offer II 024]反转链表
 */

//leetcode submit region begin(Prohibit modification and deletion)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {


        ListNode p = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = p;
            p = temp;
            temp = next;

        }
        return p;


    }
}
//leetcode submit region end(Prohibit modification and deletion)
