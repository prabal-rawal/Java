//Median of Two Sorted Arrays

public class very{
    public static void main(String[] args) {
        //nums1 = [1,3], nums2 = [2]
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double ans = Median(nums1, nums2);
        System.out.println(ans);
    }
    public static double Median(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        if(m > n){
            return Median(nums2, nums1);
        }
        int iMin = 0;
        int iMax = m;
        while(iMin <= iMax){
            int i = (iMin + iMax) / 2;
            int j = (m + n + 1) / 2 - i;
            if(i < iMax && nums2[j - 1] > nums1[i]){
                iMin = i + 1;
            }else if(i > iMin && nums1[i - 1] > nums2[j]){
                iMax = i - 1;
            }else{
                int maxLeft = 0;
                if(i == 0){
                    maxLeft = nums2[j - 1];
                }else if(j == 0){
                    maxLeft = nums1[i - 1];
                }else{
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if((m + n) % 2 == 1){
                    return maxLeft;
                }
                int minRight = 0;
                if(i == m){
                    minRight = nums2[j];
                }else if(j == n){
                    minRight = nums1[i];
                }else{
                    minRight = Math.min(nums1[i], nums2[j]);
                }
                return (maxLeft + minRight) / 2;
            }
        }
        return 0;
    }
}