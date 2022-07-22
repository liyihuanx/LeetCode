import java.util.Stack;

/**
 * @author liyihuanx
 * @date 2022-07-06 19:23:54
 * @Description [剑指 Offer 09]用两个栈实现队列
 */

//leetcode submit region begin(Prohibit modification and deletion)
class CQueue {

    //两个栈，一个出栈，一个入栈
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;


    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        // 1.stack2为空
        if (stack2.isEmpty()) {
            // 2.如果堆栈2为空，把堆栈1的拿出来放入
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            // 3.传递完值后，如果stack2还是空的，就说明两个stack都是空，否则取出
            return stack2.isEmpty() ? -1 : stack2.pop();
        }
        // 3.不为空直接取
        return stack2.pop();

    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)
