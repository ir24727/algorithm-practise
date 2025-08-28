package code;

public class minSubArrayLen {
    //滑动窗口
    public int minSubArrayLength(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum>= target){
                int subLength = right - left +1;
                result = Math.min(result, subLength);
                sum -= nums[left]; // 把最左边的数移出窗口
                left++; // 左指针右移，缩小窗口
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
