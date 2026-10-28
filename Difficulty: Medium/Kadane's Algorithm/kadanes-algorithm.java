class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = arr[0];
        int currSum = 0;
        
        for(int i=0; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        
        return maxSum;
    }
}
