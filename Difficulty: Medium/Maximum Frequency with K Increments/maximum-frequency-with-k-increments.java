class Solution {
    public int maxFrequency(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int r=0;
        int l=0;
        long total = 0;
        int maxFreq = 0;
        int n = arr.length;
        
        for(r=0; r<n; r++){
            total += arr[r];
            
            while(l+1 <= r &&((long)arr[r]*(r-l+1)) > total+k){
                total -= arr[l];
                l++;
            }
            
            maxFreq = Math.max(maxFreq, r-l+1);
        }
        
        return maxFreq;
    }
}