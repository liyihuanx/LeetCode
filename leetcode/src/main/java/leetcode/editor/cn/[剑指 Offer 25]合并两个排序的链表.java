/**
 * @author liyihuanx
 * @date 2022-07-19 18:13:37
 * @Description [剑指 Offer 25]合并两个排序的链表
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode pre = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                pre.next = l2;
                l2 = l2.next;
            } else {
                pre.next = l1;
                l1 = l1.next;
            }
            // 移动到下一个节点
            pre = pre.next;
        }

        // 出了循环在判断，不为空的都添加到后面
        pre.next = l1 !=null ? l1 : l2;

        return listNode.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
