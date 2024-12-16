class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        // 创建dp数组并初始化边界情况
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        // 处理模式p为空串，但s不为空串的情况，这种情况肯定不匹配，所以从dp[1][0]开始都是false，已经默认是false了无需额外设置

        // 处理模式p以 * 开头可以匹配空字符串的情况
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        // 填充dp数组的其余部分
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1)!= '*') {
                    dp[i][j] = (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') && dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 2] || ((s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') && dp[i - 1][j]);
                }
            }
        }

        return dp[m][n];
    }
}
