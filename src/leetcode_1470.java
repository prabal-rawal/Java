public class leetcode_1470 {
    /*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn]. */
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums,n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
    public static int[] shuffle(int[] nums, int n){
        int ans[] = new int[2*n];
        for (int i = 0; i <2*n; i++) {
            if(i%2 == 0){
                ans[i] = nums[i/2];
            }else{
                ans[i] = nums[n + i/2];
            }
        } return ans;
    }
}
