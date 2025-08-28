package code;
//暴力解法
public class minSubArrayLenMethodTwo {
    public int minSubArrayLength(int target, int[] nums) {
        int sum=0;
        int subLength = 0;
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j<nums.length; j++){
                sum +=nums[j];
                if(sum>=target){
                    subLength = j-i+1;
                    result = Math.min(result, subLength);
                    //或者：result = subLength < result ? subLength : result;
                    break; // 暴力解法不会收缩。因为 j 往后只会更长，所以可以直接 break
                }
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
