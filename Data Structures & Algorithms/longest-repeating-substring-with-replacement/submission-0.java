class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int maxF = 0;
        int ans = 0;
        for(int r = 0 ; r < s.length() ; r++){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxF = Math.max(maxF,map.get(ch));
            while(r-l+1 - maxF > k){
                char left = s.charAt(l);
                map.put(left,map.get(left)-1);
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
        
    }
}
