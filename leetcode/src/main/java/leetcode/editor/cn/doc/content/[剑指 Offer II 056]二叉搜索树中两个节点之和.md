<p>给定一个二叉搜索树的 <strong>根节点</strong> <code>root</code>&nbsp;和一个整数 <code>k</code> , 请判断该二叉搜索树中是否存在两个节点它们的值之和等于 <code>k</code> 。假设二叉搜索树中节点的值均唯一。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入: </strong>root =<strong> </strong>[8,6,10,5,7,9,11], k = 12
<strong>输出: </strong>true
<strong>解释: </strong>节点 5 和节点 7 之和等于 12
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入: </strong>root =<strong> </strong>[8,6,10,5,7,9,11], k = 22
<strong>输出: </strong>false
<strong>解释: </strong>不存在两个节点值之和为 22 的节点
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li>二叉树的节点个数的范围是&nbsp;&nbsp;<code>[1, 10<sup>4</sup>]</code>.</li>
	<li><code>-10<sup>4</sup>&nbsp;&lt;= Node.val &lt;= 10<sup>4</sup></code></li>
	<li><code>root</code>&nbsp;为二叉搜索树</li>
	<li><code>-10<sup>5</sup>&nbsp;&lt;= k &lt;= 10<sup>5</sup></code></li>
</ul>

<p>&nbsp;</p>

<p>注意：本题与主站 653 题相同：&nbsp;<a href="https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/">https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/</a></p>
<details><summary><strong>Related Topics</strong></summary>树 | 深度优先搜索 | 广度优先搜索 | 二叉搜索树 | 哈希表 | 双指针 | 二叉树</details><br>

<div>👍 34, 👎 0</div>

<div id="labuladong"><hr>

**通知：[数据结构精品课 V1.6](https://aep.h5.xeknow.com/s/1XJHEO) 持续更新中，[第八期打卡挑战（升级版）](https://mp.weixin.qq.com/s/eUG2OOzY3k_ZTz-CFvtv5Q) 7/11 截止报名，B 站已更新 [核心算法框架系列视频](https://space.bilibili.com/14089380/channel/series)。**

<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题和 [653. 两数之和 IV - 输入 BST](/problems/two-sum-iv-input-is-a-bst) 相同。

这道题的思路蛮多的，我们就用 BST 中序遍历有序这个性质外加双指针的思路来解决吧。

中序遍历的方式查看 [我的算法学习经验](https://labuladong.github.io/article/fname.html?fname=算法心得)，双指针算法查看 [一个函数秒杀 nSum 问题](https://appktavsiei5995.pc.xiaoe-tech.com/detail/i_62987931e4b0cedf38ba0684/1)。

**标签：[二叉搜索树](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2121995456690946054)**

## 解法代码

```java
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        // 转化成有序数组
        ArrayList<Integer> arr = traverse(root);
        // 有序数组中的左右双指针
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int sum = arr.get(i) + arr.get(j);
            if (sum < k) {
                // sum 调大一点
                i++;
            } else if (sum > k) {
                // sum 调小一点
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    // 返回中序遍历结果
    ArrayList<Integer> traverse(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        res.addAll(traverse(root.left));
        res.add(root.val);
        res.addAll(traverse(root.right));
        return res;
    }
}
```

</details>
</div>



