public class leetcode_1480{
    public static void main(String[] args) {
        /*Given an array nums. We define a running sum of an array as 
        runningSum[i] = sum(nums[0]…nums[i]).
        Return the running sum of nums. */
        
    }
    class Solution {
        public int[] runningSum(int[] nums) {
            int[] sums = new int[nums.length];
            sums[0] = nums[0];
            for(int i = 1; i<nums.length; i++ ){
                sums[i] = sums[i - 1] + nums[i];
            }return sums;
        }
    }


}