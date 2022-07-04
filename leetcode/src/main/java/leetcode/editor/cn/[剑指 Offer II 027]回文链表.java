/**
 * @author liyihuanx
 * @date 2022-06-30 20:45:19
 * @Description [剑指 Offer II 027]回文链表
 */

//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;

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
    public boolean isPalindrome(ListNode head) {
        ArrayList arrayList = new ArrayList<Integer>();

        while (head != null) {
            arrayList.add(head.val);
            head = head.next;
        }

        int front = 0;
        int last = arrayList.size() -1;
        while (front < last) {
            if (arrayList.get(front) != arrayList.get(last)) {
                return false;
            }
            front += 1;
            last -= 1;
        }
        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
