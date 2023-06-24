public class Arrays_5 {
    public static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
        int p = m - 1;
        int q = n - 1;
        int r = m + n - 1;

        while (p >= 0 && q >= 0)
        {
            if (nums1[p] > nums2[q]) {
                nums1[r] = nums1[p];
                p--;
            } else {
                nums1[r] = nums2[q];
                q--;
            }
            r--;
        }

        System.arraycopy(nums2, 0, nums1, 0, q + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        mergeArray(nums1, m, nums2, n);

        System.out.print("Output: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}