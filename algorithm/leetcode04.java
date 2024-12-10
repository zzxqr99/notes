class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        // 创建一个新数组用于合并两个数组
        int[] merged = new int[m + n];
        // 分别用于遍历两个原数组的指针
        int i = 0, j = 0;
        // 用于遍历合并后数组的指针
        int k = 0;
        // 合并两个数组到merged数组中
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int totalLength = m + n;
        if (totalLength % 2 == 1) {
            // 总长度为奇数，中位数就是中间那个元素
            return (double) merged[totalLength / 2];
        } else {
            // 总长度为偶数，中位数是中间两个元素的平均值
            return ((double) merged[totalLength / 2 - 1] + (double) merged[totalLength / 2]) / 2;
        }
    }
}
