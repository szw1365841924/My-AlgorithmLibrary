package arithmetic;

public class Find {

    /**
     * 找到第一个＞target的数 {1, 2, 3, 3, 3, 4, 5} ---> 5
     */
    public static int upper_bound(int[] arr, int l, int r, int target) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    /**
     * 找到第一个≥target的数 {1, 2, 3, 3, 3, 4, 5} ---> 2
     */
    public static int lower_bound(int[] arr, int l, int r, int target) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
