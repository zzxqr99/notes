class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        int curRow = 0;
        // 表示方向，1表示向下，-1表示向上
        int goingDown = 1;
        for (char c : s.toCharArray()) {
            sb[curRow].append(c);
            if (curRow == 0) {
                goingDown = 1;
            } else if (curRow == numRows - 1) {
                goingDown = -1;
            }
            curRow += goingDown;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : sb) {
            result.append(row);
        }
        return result.toString();
    }
}
