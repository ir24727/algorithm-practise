package code;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        TwoSearch ts = new TwoSearch();
        int idx = ts.search(nums, target);

        System.out.println(idx); // 期望输出 4
    }
}
