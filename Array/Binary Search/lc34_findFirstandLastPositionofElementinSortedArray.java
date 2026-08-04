import java.util.Arrays;

public class lc34_findFirstandLastPositionofElementinSortedArray {
    int findFirstOccur(int[] nums, int n, int key) {
        int left = 0;
        int right = n - 1;
        int ans = -1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == key) {
                ans = mid;
                right = mid - 1;
            } else if (key > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    int findLastOcurr(int nums[], int n, int key){
        int left = 0;
        int right = n-1;
        int ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == key){
                ans = mid;
                left = mid + 1;
            } else if (key > nums[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    int[] occurence(int[] nums, int len, int key){
        int first = findFirstOccur(nums, len, key);
        int last = findLastOcurr(nums, len, key);
        return new int[] {first, last};
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 3, 4, 5 };
        int len = arr.length;
        lc34_findFirstandLastPositionofElementinSortedArray lc34 = new lc34_findFirstandLastPositionofElementinSortedArray();
        int[] res = lc34.occurence(arr, len, 3);
        System.out.println(Arrays.toString(res));

    }
}
