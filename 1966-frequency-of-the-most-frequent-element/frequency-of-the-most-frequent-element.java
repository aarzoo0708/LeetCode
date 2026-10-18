class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int r=0;
        int l=0;
        int n=nums.length;
        int maxFreq=0;
        long total = 0;

        for(r=0; r<n; r++){
            total += nums[r];

            while(l+1<=r && ((long)nums[r]*(r-l+1)) > (total + k)){
                total -= nums[l];
                l++;
            }

            maxFreq = Math.max(maxFreq, r-l+1);
        }
        return maxFreq;
    }
}