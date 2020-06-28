package com.zhongjun.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author zhongjun
 */
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    private static int reverse(int x) {
        int value = 0;
        while (x != 0) {
            int tmp = x % 10;
            x /= 10;
            if (value > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (value < Integer.MIN_VALUE / 10) {
                return 0;
            }
            value = value * 10 + tmp;
        }
        return value;
    }
}
