class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int zCount = 0;
        int oCount = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1) oCount++;
            else oCount = 0;
            if(arr[i]==0) zCount++;
            else zCount = 0;
            
            max = Math.max(max, oCount);
            max = Math.max(max, zCount);
        }
        return max;
    }
}
