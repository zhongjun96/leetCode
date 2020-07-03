package com.zhongjun.leetcode;

import java.util.Collection;
import java.util.HashMap;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author zhongjun
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flight", "flower", "flow", ""}));
    }


    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        //遍历所有列
        for (int i = 0; i < strs[0].length(); i++) {
            // 保存 i 列第 0 行的字符便于后续比较
            char c = strs[0].charAt(i);
            //比较第 1,2,3... 行的字符和第 0 行是否相等
            for (int j = 1; j < strs.length; j++) {
                /**
                 * i == strs[j].length() 表明当前行已经到达末尾
                 * strs[j].charAt(i) != c  当前行和第 0 行字符不相等
                 * 上边两种情况返回结果
                 */
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];

    }
}
