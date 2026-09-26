class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int longest = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                sum-=1;
            }
            else{
                sum++;
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

            if(sum==0){
                longest = i + 1;
            }
            else{
                longest = Math.max(longest, i - map.get(sum));
            }
        }

        return longest;
    }
}