class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxLen = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int len = 0;
                while(set.contains(curr)){
                    curr++;
                    len++;
                    maxLen = Math.max(len,maxLen);

                }
               
            }
            
        }
        return maxLen;
    }
}