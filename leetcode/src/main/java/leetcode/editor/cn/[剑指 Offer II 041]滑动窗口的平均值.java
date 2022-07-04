import java.util.ArrayList;
import java.util.List;

/**
 * @author liyihuanx
 * @date 2022-07-04 18:32:51
 * @Description [剑指 Offer II 041]滑动窗口的平均值
 */

//leetcode submit region begin(Prohibit modification and deletion)
class MovingAverage {


    int sum = 0;
    ArrayList<Integer> nums;
    int countSize = 0;
    double temp = 0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        nums = new ArrayList<>();
        countSize = size;
    }

    public double next(int val) {
        nums.add(val);
        if (nums.size() <= countSize) {
            sum += val;
            temp = nums.size() * 1.00;
        } else {
            sum += val;
            int first = nums.size() - 1 - countSize;
            sum = sum - nums.get(first);
            temp = countSize;
        }
        return sum / temp;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
//leetcode submit region end(Prohibit modification and deletion)
