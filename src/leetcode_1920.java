public class leetcode_1920{
    public static void main(String[] args) {
        /*Given a zero-based permutation nums (0-indexed), build an array ans of the same length 
        where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
        A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */
        int[] nums = {0,2,1,5,3,4};
        int[] ans = solution(nums);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
           
    }
    static int[] solution(int[] nums){
        int ans[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }return ans;
    }
}
