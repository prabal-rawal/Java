public class leetcode_1672 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{2,3,4}};
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts) {
        /*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money 
        the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
        A customer's wealth is the amount of money they have in all their bank accounts. 
        The richest customer is the customer that has the maximum wealth.
 */
        int max = 0;
        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
        }return max;
    }

}
