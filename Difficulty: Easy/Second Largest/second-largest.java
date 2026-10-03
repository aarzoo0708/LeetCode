class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = arr[0];
        int secMax = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            
            else if(arr[i]>secMax && arr[i]!=max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
}