class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i : nums){
            sum += i;
        }
        if(sum%2 != 0){
            return false;
        }
        int target = sum/2;
        boolean dp[][] = new boolean[n+1][target+1];
        for(int i = 0 ; i <= n ; i++){
            dp[i][0] = true;
        }
        for(int i = n-1 ; i >= 0; i--){
            for(int j = 0 ; j <= target ; j++){
                boolean skip = dp[i+1][j];
                boolean take = false;
                if(nums[i] <= j){
                    take = dp[i+1][j-nums[i]];
                }
                dp[i][j] = take || skip;
            }
        }
        return dp[0][target];
    }
}
