class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> hm1=new HashMap<>();
        HashMap<Character, Integer> hm2=new HashMap<>();
        int l=0, max=0;
        for(char ch : s1.toCharArray())
        {
            hm1.put(ch, hm1.getOrDefault(ch,0)+1);

        }
        for(int r=0;r<s2.length();r++)
        {
            char curr=s2.charAt(r);
            hm2.put(curr, hm2.getOrDefault(curr,0)+1);
            while((r-l+1)>s1.length())
            {
                char left=s2.charAt(l);
                hm2.put(left, hm2.get(left)-1);
                if(hm2.get(left)==0)
                {
                    hm2.remove(left);
                }
                l++;
            }
            if(hm1.equals(hm2))
            {
                return true;
            }
        }
        return false;
        
    }
}
