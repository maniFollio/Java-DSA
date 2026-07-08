public class lc1752_checkSortedAndRoataed {
    boolean sortedRoat(int[] arr, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > arr[(i + 1) % size]) {
                count++;
            }
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        lc1752_checkSortedAndRoataed rs = new lc1752_checkSortedAndRoataed();
        int[] arr = {2,1,3,4};
        // int[] arr = {3,4,5,1,2};
        int size = arr.length;
        System.out.println(rs.sortedRoat(arr, size));
    }
}
