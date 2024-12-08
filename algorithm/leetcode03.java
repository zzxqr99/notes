import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        for (int left = 0, right = 0; right < n; right++) {
            if (map.containsKey(s.charAt(right))) {
                // 如果窗口中已经存在该字符，移动左边界（收缩窗口）
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            // 将当前字符及其在字符串中的位置加入哈希表（或更新位置）
            map.put(s.charAt(right), right);
            // 更新最大无重复子串长度
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
