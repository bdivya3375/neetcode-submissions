class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int max = 0;
        int n = nums.length;
        int z = 0;
        for(int r = 0 ; r < n ; r++){
            int a = nums[r];
            if(a == 0){
                z++;
            }
            while(z > k){
                int b = nums[l];
                if(b == 0){
                    z--;
                }
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
        
    }
}