class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt = 0;
        int avg = 0;
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum = sum+arr[i];
        }
        avg = sum/k;
        if(avg >= threshold){
            cnt++;
        }
        for(int i = k ; i < arr.length ; i++){
            sum = sum-arr[i-k];
            sum = sum + arr[i];
            avg = sum/k;
            if(avg >= threshold){
                cnt++;
            }
        }

        
        return cnt;
        
    }
}