class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        if(arr.length==1){
            return arr[0];
        }
        for(int i=0; i<n-1; i++){
            int count = 1;
            while(i<n-1 && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            if(count > n/4){
                return arr[i];
            }
        }
        return -1;
    }
}