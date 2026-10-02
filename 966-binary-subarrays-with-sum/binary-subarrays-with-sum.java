class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int pSum = 0;
        int count = 0;

        for(int num: nums){
            pSum+=num;

            if(map.containsKey(pSum - goal)){
                count += map.get(pSum-goal);
            }

            map.put(pSum, map.getOrDefault(pSum, 0) + 1);
        }
        return count;
    }
}