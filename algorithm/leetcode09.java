class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int originalX = x;
        int reverse = 0;
        while (x!= 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return originalX == reverse;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
}
