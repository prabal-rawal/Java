public class leetcode_704 {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int ans = search(nums,target);
        System.out.print(ans);

    }
    public static int search(int[] nums, int target) {
        int start = 0; int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start/2);
            if(nums[mid]<target){
                start = mid + 1;
            }else if(nums[mid]>target){
                end = mid -1;
            }else if(nums[mid] == target){
                return mid;
            }
        }return -1;
    }
}
//nums is an array sorted in ascending order.
//target is an int value we will try to find in the array
//If the target is present in the array we will print out the index of teh target 
//If target doesn't exist in the array we return -1

//let's try to implement binary search
//We will start off with a while loop condt: Start<End
// nums = {1, 23, 27, 28, 33,43} target = 33
//length of nums[] = 5


