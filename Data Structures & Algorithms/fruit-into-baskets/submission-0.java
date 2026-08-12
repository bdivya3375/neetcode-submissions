class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0;
        int max = 0;
        int n = arr.length;
        for(int r = 0 ; r < n ; r++){
            int a = arr[r];
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.size() > 2){
                int b = arr[l];
                map.put(b,map.get(b)-1);
                if(map.get(b) == 0){
                    map.remove(b);
                }
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
        
    }
}