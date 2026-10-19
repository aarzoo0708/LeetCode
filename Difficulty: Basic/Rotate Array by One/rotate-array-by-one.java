class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int temp = arr[n-1];
        for(int j=n-2; j>=0; j--){
            arr[j+1] = arr[j];
        }
        arr[0] = temp;
    }
}