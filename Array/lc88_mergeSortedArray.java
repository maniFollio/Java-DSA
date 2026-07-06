import java.util.Arrays;

public class lc88_mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mrg = new int[m + n];
        
        // Brute Force Approach.
        for (int i = 0; i < m; i++) {
            mrg[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {
            mrg[m + j] = nums2[j];
        }
        Arrays.sort(mrg);

        for (int i = 0; i < mrg.length; i++) {
            nums1[i] = mrg[i];
        }

        for (int i = 0; i < mrg.length; i++) {
            System.out.print("  " + nums1[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        lc88_mergeSortedArray lc88 = new lc88_mergeSortedArray();
        lc88.merge(nums1, m, nums2, n);
    }
}
