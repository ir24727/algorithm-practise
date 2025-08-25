package code;

import java.util.Arrays;

public class FastSlowPionterMethodTwo {
    public int[] sortedSquares(int[] nums) {
        //暴力解法
        for(int i=0; i < nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

