class Solution {
    public static int reverse(int x) {
        int result = 0;
        while (x!= 0) {
            // 取出末尾数字
            int pop = x % 10;
            x /= 10;
            // 判断是否溢出，使用临时变量先存储反转后的值
            int temp = result * 10 + pop;
            if ((temp - pop) / 10!= result) {
                return 0;
            }
            result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));
    }
}
        
   
