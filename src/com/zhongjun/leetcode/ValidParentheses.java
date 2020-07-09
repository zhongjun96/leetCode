package com.zhongjun.leetcode;

import java.util.*;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({}[]([]{}))"));
    }

    public static boolean isValid(String s) {
        if (s == null  || s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>(3);
        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');
        map.put('!', '!');
        LinkedList<Character> list = new LinkedList<>();
        list.add('!');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                list.add(c);
            } else if (map.get(list.removeLast()) != c) {
                return false;
            }
        }
        return list.size() == 1;
    }
}
