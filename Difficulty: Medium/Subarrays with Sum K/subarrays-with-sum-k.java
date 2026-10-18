class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int count = 0;
        int currSum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int n: arr){
            currSum+=n;
            int reqSum = currSum-k;
            
            if(map.containsKey(reqSum)){
                count+=map.get(reqSum);
            }
            
            map.put(currSum, map.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}