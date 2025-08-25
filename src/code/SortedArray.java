package code;

public class SortedArray {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int[] result = new int [nums.length]; //创建一个整型数组
        int index = nums.length - 1;

        while(left<=right){
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                result[index] = nums[left]*nums[left];
                index--;
                left++;
            }
            else{
                result[index] = nums[right]*nums[right];
                index--;
                right--;
            }
        }
        return result;
    }
}
