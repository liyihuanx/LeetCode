/**
 * @author liyihuanx
 * @date 2022-07-19 18:13:41
 * @Description [剑指 Offer 24]反转链表
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
//leetcode submit region end(Prohibit modification and deletion)
