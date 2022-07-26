<p>输入一个字符串，打印出该字符串中字符的所有排列。</p>

<p>&nbsp;</p>

<p>你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。</p>

<p>&nbsp;</p>

<p><strong>示例:</strong></p>

<pre><strong>输入：</strong>s = &quot;abc&quot;
<strong>输出：[</strong>&quot;abc&quot;,&quot;acb&quot;,&quot;bac&quot;,&quot;bca&quot;,&quot;cab&quot;,&quot;cba&quot;<strong>]</strong>
</pre>

<p>&nbsp;</p>

<p><strong>限制：</strong></p>

<p><code>1 &lt;= s 的长度 &lt;= 8</code></p>
<details><summary><strong>Related Topics</strong></summary>字符串 | 回溯</details><br>

<div>👍 582, 👎 0</div>

<div id="labuladong"><hr>

**通知：[数据结构精品课 V1.7](https://aep.h5.xeknow.com/s/1XJHEO) 持续更新中；[第九期打卡挑战](https://aep.h5.xeknow.com/s/3SlWbp) 即将开始；B 站可查看 [核心算法框架系列视频](https://space.bilibili.com/14089380/channel/series)。**

<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这就是 [一文秒杀所有排列组合子集问题](https://labuladong.github.io/article/fname.html?fname=子集排列组合) 中讲的「元素可重不可复选」的排列问题，前文我使用 [47. 全排列 II（中等）](/problems/permutations-ii) 举的例子，你把 47 题的解法代码稍微改一改就可以解决这道题了。

**标签：[回溯算法](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2122002916411604996)，排列组合**

## 解法代码

```java
class Solution {
    public String[] permutation(String s) {
        permuteUnique(s.toCharArray());
        String[] arr = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    List<String> res = new ArrayList<>();
    StringBuilder track = new StringBuilder();
    boolean[] used;

    public List<String> permuteUnique(char[] nums) {
        // 先排序，让相同的元素靠在一起
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtrack(nums);
        return res;
    }

    void backtrack(char[] nums) {
        if (track.length() == nums.length) {
            res.add(track.toString());
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            // 新添加的剪枝逻辑，固定相同的元素在排列中的相对位置
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            track.append(nums[i]);
            used[i] = true;
            backtrack(nums);
            track.deleteCharAt(track.length() - 1);
            used[i] = false;
        }
    }
}
```

</details>
</div>



