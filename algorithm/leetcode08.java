public class Solution {
    public int myAtoi(String s) {
        // 去除前导空格
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int sign = 1;  // 符号，1表示正数，-1表示负数
        int index = 0;
        // 判断符号位
        if (s.charAt(0) == '+') {
            index++;
        } else if (s.charAt(0) == '-') {
            sign = -1;
            index++;
        }
        int result = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            // 判断是否溢出
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }
}
